package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class customer_005fdeletein_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  Connection con =null;
  Statement stmt =null;
  StringBuffer SQL =null;
  ResultSet rs =null;

  //ローカルのMySQLに接続する設定
  String USER ="yudai";
  String PASSWORD ="yudai";
  String URL ="jdbc:mysql://localhost/nhs00305db";
  String DRIVER ="com.mysql.jdbc.Driver";
  
  //確認メッセージ
  StringBuffer ERMSG =null;
  
  //HashMap(1件分のデータを格納する配列)
  HashMap<String,String>map=null;
  
  //ArrayList(すべての件数を格納する配列)
  ArrayList<HashMap>list=null;
  list = new ArrayList<HashMap>();
  
   try{	//ロードに失敗したときのための例外処理
  		//JDBCドライバのロード
  		Class.forName(DRIVER).newInstance();
  		
  		//Connectionオブジェクトの作成
  		con =DriverManager.getConnection(URL,USER,PASSWORD);
  		
  		//Statementオブジェクトの作成
  		stmt = con.createStatement();
  
  		//SQLステートメントの作成(選択クエリ)
 		SQL = new StringBuffer();
 		
 		//SQL分の発行(選択クエリ)
 		SQL.append("select * from cus_tbl");
 		
 		//SQL文の発行(選択クエリ)
 		rs=stmt.executeQuery(SQL.toString());
 		
 		while(rs.next()){
  			//DBのデータをHashMapへ格納する
  				map =new HashMap<String,String>();
  				map.put("cus_no",rs.getString("cus_no"));
  				map.put("cus_id",rs.getString("cus_id"));
  				map.put("cus_pas",rs.getString("cus_pas"));
  				map.put("cus_name",rs.getString("cus_name"));
  				
  				//1件分のデータ(HashMap)をArrayListへ追加
  				list.add(map);
 		}
 	}	//tryブロック終了
 	catch(ClassNotFoundException e){
		ERMSG =new StringBuffer();
		ERMSG.append(e.getMessage());
	}
	catch(SQLException e){
		ERMSG =new StringBuffer();
		ERMSG.append(e.getMessage());
	}
	catch(Exception e){
		ERMSG =new StringBuffer();
		ERMSG.append(e.getMessage());
	}
	
	finally{
				//各種オブジェクトクローズ
			try{
					if(rs !=null){
						rs.close();
					}
					if(stmt !=null){
						stmt.close();
					}
					if(con !=null){
						con.close();
					}
				}
			catch(SQLException e){
			ERMSG =new StringBuffer();
			ERMSG.append(e.getMessage());
			}
		}
 
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <!DOCTYPE html PUBLIC\"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;\" charset=\"utf-8\">\r\n");
      out.write("<title>『顧客テーブルの内容を読み込みそのまま表示するプログラム』</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form method=\"post\" action=\"/JV16/customer_deleteout.jsp\">\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("\t<tr><th>削除</th><th>顧客No.</th><th>顧客ID</th><th>パスワード</th><th>氏名</th></tr>\r\n");
      out.write("\t\r\n");

	//ArryListからデータを取り出す
	for(int i=0;i<list.size();i++){

      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td align='center'bgcolor='blue'>\r\n");
      out.write("\t\t<input type=\"radio\" name=\"cus_no\" value=\"");
      out.print( list.get(i).get("cus_no") );
      out.write("\"></td>\r\n");
      out.write("\t\t<td>");
      out.print( list.get(i).get("cus_no") );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( list.get(i).get("cus_id") );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( list.get(i).get("cus_pas") );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( list.get(i).get("cus_name") );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<input type=\"submit\" value=\"削除\">\r\n");
      out.write("</form>\r\n");
 if(ERMSG !=null){ 
      out.write("\r\n");
      out.write("予期せぬエラーが発生しました<br />\r\n");
      out.print( ERMSG );
      out.write('\r');
      out.write('\n');
 }else{ 
      out.write("\r\n");
      out.write("※エラーは発生しませんでした<br/>\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
