package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class customer3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("<TITLE>『顧客テーブルの内容を読み込みそのまま表示するプログラム』</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("\t<tr><th>顧客No.</th><th>顧客ID</th><th>パスワード</th><th>氏名</th></tr>\r\n");

	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	//データベースに接続するために使用する変数宣言
	Connection con = null;
	Statement stmt = null;
	StringBuffer SQL = null;
	ResultSet rs = null;
	
	//ローカルのMysqlの接続する設定
	String USER = "root";
	String PASSWORD = "root";
	String URL = "jdbc:mysql://localhost/nhs00305db";
	String DRIVER = "com.mysql.jdbc.Driver";
	//確認メッセージ
	StringBuffer ERMSG = null;
	
	try{	//ロードに失敗したときのための例外処理
			//JDBCドライバのロード
			Class.forName(DRIVER).newInstance();
					
			//Connectionオブジェクトの作成
			con = DriverManager.getConnection(URL,USER,PASSWORD);
	
			//Statementオブジェクトの作成
			stmt = con.createStatement();
					
			//SQLステートメントの作成(選択クエリー)
			SQL = new StringBuffer();
					
			//SQL文の発行(選択クエリ-)
			SQL.append("select * from cus_tbl");
					
			//SQL文の発行(選択クエリ-)
			rs = stmt.executeQuery(SQL.toString());
			
			//抽出したデータを繰り返し処理で表示する。
			while(rs.next()){
			//顧客NO(自動生成)
			out.println("<tr><td>" + rs.getString("cus_no") + "</td>");
			//顧客ID(ログインＩＤ)
			out.println("<td>" + rs.getString("cus_id") + "</td>");
			//顧客PW(ログインパスワード)
			out.println("<td>" + rs.getString("cus_pas") + "</td>");
			//ハンドルネーム
			out.println("<td>" + rs.getString("cus_name") + "</td></tr>");
			}
		}	//tryブロック終了
		catch(ClassNotFoundException e){
				ERMSG = new StringBuffer();
				ERMSG.append(e.getMessage());
		}
		catch(SQLException e){
				ERMSG = new StringBuffer();
				ERMSG.append(e.getMessage());
		}
		catch(Exception e){
				ERMSG = new StringBuffer();
				ERMSG.append(e.getMessage());
		}
		
		finally{		//例外があってもなくても必ず実行する
						//各種オブジェクトクローズ(後付け)
		    try{
		    			if(rs != null){
		    							rs.close();
		    			}
		    			if(stmt != null){
		    							stmt.close();
		    			}
		    			if(con != null){
		    							con.close();
		    			}
		    }
						catch(SQLException e){
						ERMSG = new StringBuffer();
						ERMSG.append(e.getMessage());
						}
		}

      out.write("\r\n");
      out.write("</table>\r\n");
 if(ERMSG != null){ 
      out.write("\r\n");
      out.write("予期せぬエラーが起きました<br />\r\n");
      out.print( ERMSG );
      out.write('\r');
      out.write('\n');
 }else{ 
      out.write("\r\n");
      out.write("※エラーは発生しませんでした<br/>\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
