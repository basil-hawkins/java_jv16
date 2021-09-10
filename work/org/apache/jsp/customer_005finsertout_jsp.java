package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class customer_005finsertout_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  //文字コードの指定
  request.setCharacterEncoding("UTF-8");
  response.setCharacterEncoding("UTF-8");
  
  //入力データ受信
  String cus_idStr = request.getParameter("cus_id");
  String cus_pasStr = request.getParameter("cus_pas");
  String cus_nameStr = request.getParameter("cus_name");

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
  
  //追加件数
  int ins_count = 0;
  
    try{  //ロードに失敗したときの例外処理
        //JDBCドライバのロード
        Class.forName(DRIVER).newInstance();
        
        //Connectionオブジェクトの作成
        con = DriverManager.getConnection(URL,USER,PASSWORD);
        
        //Statementオブジェクトの作成
        stmt = con.createStatement();
        
        //SQLステーメントの作成(選択クエリ)
        SQL = new StringBuffer();
        
        //SQL文の構築(DB検索)
        SQL.append("select * from cus_tbl where cus_id ='");
        SQL.append(cus_idStr);
        SQL.append("'");
        System.out.println(SQL.toString());
        
        //SQL文の実行(DB検索)
        rs = stmt.executeQuery(SQL.toString());
        
        //入力したデータがデータベースに存在するか調べる
        if(rs.next()){ //存在する(追加NG)
                  //ヒットフラグON
                  hit_flag = 1;
      }else{ //存在しない(追加OK)
                  //ヒットフラグOFF
                  hit_flag = 0;
                  //SQLステートメントの作成(選択クエリ)
                  SQL = new StringBuffer();

                  //SQL文の文の構築(DB追加)
                  SQL.append("insert into cus_tbl(cus_id,cus_pas,cus_name)");
                  SQL.append(" values('");
                  SQL.append(cus_idStr);
                  SQL.append("','");
                  SQL.append(cus_pasStr);
                  SQL.append("','");
                  SQL.append(cus_nameStr);
                  SQL.append("')");
  //System.out.println(SQL.toString());

                  //SQL文の実行(DB追加)
                  ins_count = stmt.executeUpdate(SQL.toString());

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
      out.write("<title>『顧客テーブルにレコードを追加するプログラム』</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

            if(hit_flag == 1){ //追加NG

      out.write("\r\n");
      out.write("\t\t\t追加NG<br>\r\n");
      out.write("\t\t\t ");
      out.print("入力された顧客IDは既に存在しています");
      out.write('\r');
      out.write('\n');

            }else if(ins_count == 0){ //追加処理失敗

      out.write("\r\n");
      out.write("             　　　　　　 追加NG<br>\r\n");
      out.write("               ");
      out.print( "登録処理が失敗しました" );
      out.write('\r');
      out.write('\n');

              }else{ //認証OK

      out.write("\r\n");
      out.write("\t\t\t  追加OK<br>\r\n");
      out.write("\t\t\t  ");
      out.print( ins_count+ "件　登録が完了しました");
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
