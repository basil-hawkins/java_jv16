package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class customer_005fselectout_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write(">\r\n");
      out.write("\r\n");

  //文字コードの指定
  request.setCharacterEncoding("UTF-8");
  response.setCharacterEncoding("UTF-8");
  
  //入力データ受信
  String cus_idStr = request.getParameter("cus_id");
  String cus_pasStr = request.getParameter("cus_pas");
  
  //データベースに接続するために使用する変数宣言
  Connection con = null;
  Statement stmt = null;
  StringBuffer SQL = null;
  ResultSet rs = null;
  
  //ローカルのMySQLに接続する設定
  String USER = "yudai";
  String PASSWORD = "yudai";
  String URL = "jdbc:mysql://localhost/nhs00305db";
  String DRIVER = "com.mysql.jdbc.Driver";
  
  //確認メッセージ
  StringBuffer ERMSG = null;
  
  //ヒットフラグ
  int hit_flag = 0;
  
  //HashMap(1件分のデータを格納する連想配列)
  HashMap<String,String>map = null;
  
  //ArrayList(すべての件数を格納する配列)
  ArrayList<HashMap>list = null;
  list = new ArrayList<HashMap>();
  
    try{  //ロードに失敗したときの例外処理
        //JDBCドライバのロード
        Class.forName(DRIVER).newInstance();
        
        //Connectionオブジェクトの作成
        con = DriverManager.getConnection(URL,USER,PASSWORD);
        
        //Statementオブジェクトの作成
        stmt = con.createStatement();
        
        //SQLステーメントの作成(選択クエリ)
        SQL = new StringBuffer();
        
        //SQL文の構築(選択クエリ)
        SQL.append("select * from cus_tbl where cus_id ='");
        SQL.append(cus_idStr);
        SQL.append("'and cus_pas='");
        SQL.append(cus_pasStr);
        SQL.append("'");
        System.out.println(SQL.toString());
        
        //SQL文の実行(選択クエリ)
        rs = stmt.executeQuery(SQL.toString());
        
        //入力したデータがデータベースに存在するか調べる
        if(rs.next()){ //存在する
                  //ヒットフラグON
                  hit_flag = 1;
                  
              //検索データをHashMapへ格納する
              map = new HashMap<String,String>();
                  map.put("cus_no",rs.getString("cus_no")); 
                  map.put("cus_id",rs.getString("cus_id")); 
                  map.put("cus_pas",rs.getString("cus_pas")); 
                  map.put("cus_name",rs.getString("cus_name"));   
                  
                  //1件分のデータ(HashMap)をArrayListへ追加
                  list.add(map);
                  
                  if(list.get(0).get("cus_pas").equals(cus_pasStr)){
                  
                  hit_flag = 1;
                  }else{
                  hit_flag = 0;
                  }
                  
              }else{ //存在しない
                  //ヒットフラグOFF
                  hit_flag = 0;
                }       
        }       //tryブロック終了
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
                ERMSG = new StringBuffer();
                ERMSG.append(e.getMessage());
                }
          }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC\"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>『顧客テーブルを読み、ログイン認証するプログラム』</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

            if(hit_flag == 1){ //認証OK

      out.write("\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("              認証OK\r\n");
      out.write("              <tr><th>顧客No.</th><th>顧客ID</th><th>パスワード</th><th>氏名</th></tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>");
      out.print( list.get(0).get("cus_no") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( list.get(0).get("cus_id") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( list.get(0).get("cus_pas") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( list.get(0).get("cus_name") );
      out.write("</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("</table>\r\n");

              }else{ //認証NG

      out.write("\r\n");
      out.write("              認証NG<br>\r\n");
      out.write("               ");
      out.print( "顧客IDまたはパスワードが間違っています" );
      out.write('\r');
      out.write('\n');

              }

      out.write("\r\n");
      out.write("<br><br>\r\n");
 if(ERMSG !=null){ 
      out.write("\r\n");
      out.write("予期せぬエラーが発生しました<br/>\r\n");
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
      out.write("</html>\r\n");
      out.write("\r\n");
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
