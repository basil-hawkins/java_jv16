package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class syouhin_005findex_005faction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

		//文字コードの指定
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//データベースに接続するために使用する変数宣言
		Connection con = null;
		Statement stmt = null;
		StringBuffer SQL = null;
		ResultSet rs = null;
		
		//ローカルのMySQLに接続する設定
		String USER ="yudai";
		String PASSWORD ="yudai";
		String URL ="jdbc:mysql://localhost/nhs00305db";
		String DRIVER ="com.mysql.jdbc.Driver";
		
		//例外処理メッセージ
		StringBuffer ERMSG = null;
		
		String COMPMSG = null; 		//確認メッセージ
		String COMPPRO = null;
		boolean flg = true;
		
		//ログインページよりID,PASSの取得
		String cus_id =request.getParameter("id");
		String cus_pas = request.getParameter("pas");
		
		if(cus_id != "" && cus_pas != ""){
				try{
					//JDBCドライバのダウンロード
					Class.forName(DRIVER).newInstance();
					
					//Connectionオブジェクトの作成
					con = DriverManager.getConnection(URL,USER,PASSWORD);
					
					//Statementオブジェクトの作成
					stmt = con.createStatement();
					
					//SQLステートメントの作成(選択クエリ)
					SQL = new StringBuffer();
					SQL.append("select cus_name from cus_tbl ");
					SQL.append("where cus_id = '" + cus_id + "' and cus_pas = '" + cus_pas + "'");
				
					//SQL文の発行
					rs = stmt.executeQuery(SQL.toString());
					
					//読み込み確認
					if(rs.next() == true){   //ログインOK
							//有効期限30秒
							session.setMaxInactiveInterval(30);
							
							//セッションにバインド
							session.setAttribute("login_name" ,rs.getString("cus_name"));
							
							//メインページへ
							response.sendRedirect("syouhin_main.jsp");
					}else{   //ログインNG
						COMPMSG ="該当レコードは存在しません ";
					}
						}		//tryブロック終了
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
						
					finally{
							//各種オブジェクトソース
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
			}else{
				COMPMSG="未入力項目があります";
			}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>認証処理</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 if(ERMSG != null){ 
      out.write("\r\n");
      out.write("予期せぬエラーが発生しました<br />\r\n");
      out.print( ERMSG );
      out.write('\r');
      out.write('\n');
 }else{ 
      out.write('\r');
      out.write('\n');
      out.print( COMPMSG );
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n");
      out.write(" \t<form method = \"post\" action = \" /JV16/syouhin_index.jsp\">\r\n");
      out.write("\t\t\r\n");
      out.write(" \t<input type = \"submit\" value = \"戻る\">\r\n");
      out.write(" \t\r\n");
      out.write(" \t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\t\t\t\t\t\t");
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
