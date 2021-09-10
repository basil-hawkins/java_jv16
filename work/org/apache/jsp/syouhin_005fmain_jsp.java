package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class syouhin_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

		//文字コードの指定
		request.setCharacterEncoding("UTF-8"); 
		response.setCharacterEncoding("UTF-8");
		
		//セッションネーム取得
		String session_name = (String)session.getAttribute("login_name");
		if(session_name == null)
		{
				response.sendRedirect("syouhin_index.jsp");
		}

		//	データベースに接続するために使用する変数宣言
		Connection con = null;
		Statement stmt = null;
		StringBuffer SQL = null;
		ResultSet rs = null;

		//	ローカルのMySQLに接続する設定
		String USER = "yudai";
		String PASSWORD = "yudai";
		String URL = "jdbc:mysql://localhost/nhs00305db";
		String DRIVER = "com.mysql.jdbc.Driver";

		//確認メッセージ
		StringBuffer ERMSG = null;

		//HashMap(１件分のデータを格納する連想配列)
		HashMap<String,String> map = null;

		//ArrayList(すべての件数を格納する配列)
		ArrayList<HashMap> list = null;
		list = new ArrayList<HashMap>();	//初期化


		try{		//ロードに失敗したときのための例外処理
					//JDBCドライバのロード
					 Class.forName(DRIVER).newInstance();
					
					//Connectionオブジェクトの作成
					con = DriverManager.getConnection(URL,USER,PASSWORD);

					//Statementオブジェクトの作成
					stmt = con.createStatement();

					//SQLステートメントの作成（選択クエリ）
					SQL = new StringBuffer();
					
					//SQL文の発行（選択クエリ）
					SQL.append("select syou_no,syou_name,syou_pre,syou_msg,syou_icon,pre_name from syou_tbl,ken_tbl where syou_pre = pre_no order by syou_no");
					
					System.out.println(SQL.toString());
					
					//SQL文の発行（選択クエリ）
					rs = stmt.executeQuery(SQL.toString());

					//抽出したデータを繰り返し処理で表示する
					while(rs.next()){
						//DBのデータをHashMapへ格納する
								map = new HashMap<String,String>();
								map.put("syou_no",rs.getString("syou_no"));
								map.put("syou_name",rs.getString("syou_name"));
								map.put("pre_name",rs.getString("pre_name"));
								map.put("syou_msg",rs.getString("syou_msg"));
								map.put("syou_icon",rs.getString("syou_icon"));

								//１件分のデータ（HashMap）をArrayListへ追加
								list.add(map);
						}
		}	//ｔｒｙブロック終了

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
					//	各種オブジェクトクローズ
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\t\r\n");
      out.write("<HTML>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv= \"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<title>商品管理　全件検索</title>\t\t\r\n");
      out.write(" \t</head>\r\n");
      out.write(" \t");
 if(ERMSG != null){ 
      out.write("\r\n");
      out.write(" \t\t予期せぬエラーが発生しました<br />\r\n");
      out.write(" \t");
      out.print( ERMSG );
      out.write("\r\n");
      out.write(" \t");
 } 
      out.write("\r\n");
      out.write(" \t<body>\r\n");
      out.write(" \t\r\n");
      out.write(" \t\r\n");
      out.write("\r\n");
      out.write(" \t \tsessionID:");
      out.print( session.getId() );
      out.write("<br />\r\n");
      out.write(" \t<h2>ようこそ！　");
      out.print( session_name );
      out.write(" さん</h2><br />\r\n");
      out.write(" \t<br />\r\n");
      out.write(" \t<h1>商品一覧</h1>\r\n");
      out.write(" \t\r\n");
      out.write(" \t\r\n");
      out.write(" \t");

		//ArrayListからデータを取り出す
		for(int i=0; i<list.size(); i++){
	
      out.write("\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td rowspan = \"5\">\r\n");
      out.write("\t\t\t<img src=\"./image/");
      out.print( list.get(i).get("syou_icon") );
      out.write(".png\" height=\"70px\" width=\"70px\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>商品No.</td>\r\n");
      out.write("\t\t<td width=\"300\"> ");
      out.print( list.get(i).get("syou_no") );
      out.write(" </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>商品名</td>\r\n");
      out.write("\t\t<td width=\"300\"> ");
      out.print( list.get(i).get("syou_name") );
      out.write(" </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>生産地</td>\r\n");
      out.write("\t\t<td width=\"300\"> ");
      out.print( list.get(i).get("pre_name") );
      out.write(" </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>コメント</td>\r\n");
      out.write("\t\t<td width=\"300\"> ");
      out.print( list.get(i).get("syou_msg") );
      out.write(" </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<a href=\"syouhin_updatein.jsp?syouhin_no=");
      out.print( list.get(i).get("syou_no") );
      out.write("\">[編集]</a>\r\n");
      out.write("\t\t\t<a href=\"syouhin_deletemid.jsp?syouhin_no=");
      out.print( list.get(i).get("syou_no") );
      out.write("\">[削除]</a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t");
 
		}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write(" \t<form method = \"post\" action = \" /JV16/syouhin_insertin.jsp\">\r\n");
      out.write("\t\t\r\n");
      out.write(" \t<input type = \"submit\" value = \"商品登録\">\r\n");
      out.write(" \t\r\n");
      out.write(" \t</form>\r\n");
      out.write(" \t\r\n");
      out.write(" \t<form method = \"post\" action = \"syouhin_index.jsp\">\r\n");
      out.write("\t<input type = \"hidden\" name=\"logout\" value = \"logout\">\r\n");
      out.write(" \t<input type = \"submit\" value = \"ログアウト\">\r\n");
      out.write(" \t\r\n");
      out.write(" \t</form>\r\n");
      out.write(" \t</body>\r\n");
      out.write("</HTML>\r\n");
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
