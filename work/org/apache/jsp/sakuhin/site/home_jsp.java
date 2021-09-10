package org.apache.jsp.sakuhin.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');

  //文字コードの指定
  request.setCharacterEncoding("UTF-8");
  response.setCharacterEncoding("UTF-8");

  //データベースへ接続するために使用する変数宣言
  Connection con = null;
  Statement stmt = null;
  StringBuffer SQL = null;
  ResultSet rs =null;

  //ローカルのMySQLへ接続する設定
  String USER ="yudai";
  String PASSWORD = "yudai";
  String URL = "jdbc:mysql://localhost/fit";
  String DRIVER = "com.mysql.jdbc.Driver";

  //例外処理用メッセージ
  StringBuffer ERMSG = null;

  //ヒットフラグ
  int hit_flag = 0;

  //ログインページによりID,PASSの取得
  String user_mail = request.getParameter("mail");
  String user_pas = request.getParameter("pas");

                try{
                //JDBCドライバーのロード
                Class.forName(DRIVER).newInstance();

                //Connectionオブジェクトの作成
                con = DriverManager.getConnection(URL,USER,PASSWORD);

                //Statementオブジェクトの作成
                stmt = con.createStatement();

                //SQLステートメントの作成(選択クエリ)  
                SQL = new StringBuffer();
                SQL.append("select * from user where user_mail = '");
                SQL.append(user_mail);
                SQL.append("' and user_pas = '");
                SQL.append(user_pas);
                SQL.append("'");

                //SQL文の発行(選択クエリ)
                rs = stmt.executeQuery(SQL.toString());

                //読み込み確認
                if(rs.next()){         //ログインOK
               //ヒットフラグON
               hit_flag = 1;
                          }else{                      //ログインNG
                     //ヒットフラグOFF
                     hit_flag = 0;
                        }

              }             //tryブロック終了
catch(ClassNotFoundException e ){
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("    <title>名称未設定</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\n");
      out.write("\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Oswald:wght@600&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");

 if(hit_flag == 1){

      out.write("\n");
      out.write("    <div id=\"waku\">\n");
      out.write("\n");
      out.write("<div id=\"zentai\">\n");
      out.write("\n");
      out.write("      <table>\n");
      out.write("        <tr>\n");
      out.write("          <td><a href=\"taikei.html\"><img src=\"images/taikei.png\" alt=\"mitei\" class=\"img1\"></a></td>\n");
      out.write("          <td><a href=\"torendo.html\"><img src=\"images/torendo.png\" alt=\"mitei\" class=\"img1\"></a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td><a href=\"shinsaku.html\"><img src=\"images/shinsaku.png\" alt=\"mitei\" class=\"img1\"></a></td>\n");
      out.write("          <td><a href=\"rankingu.html\"><img src=\"images/rankingu.png\" alt=\"mitei\" class=\"img1\"></a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td><a href=\"bamen.html\"><img src=\"images/bamen.png\" alt=\"mitei\" class=\"img1\"></a></td>\n");
      out.write("          <td><a href=\"osusume.html\"><img src=\"images/osusume.png\" alt=\"mitei\" class=\"img1\"></a></td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write("\n");
      out.write("      <table id=\"moderu\">\n");
      out.write("        <tr>\n");
      out.write("          <td><a href=\"tanin.html\"><img src=\"images/moderu1.jpg\" alt=\"mitei\" class=\"img2\"></a></td>\n");
      out.write("          <td><a href=\"tanin.html\"><img src=\"images/moderu2.jpg\" alt=\"mitei\" class=\"img2\"></a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td><a href=\"tanin.html\"><img src=\"images/moderu2.jpg\" alt=\"mitei\" class=\"img2\"></a></td>\n");
      out.write("          <td><a href=\"tanin.html\"><img src=\"images/moderu1.jpg\" alt=\"mitei\" class=\"img2\"></a></td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write("\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("      <header class=\"manyu\">\n");
      out.write("        <nav>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"home.html\" class=\"botan\"><img src=\"images/home.png\" class=\"aikon\"></a></li>\n");
      out.write("            <li><a href=\"kensaku.html\" class=\"botan\"><img src=\"images/mushi.png\" class=\"aikon\"></a></li>\n");
      out.write("            <li><a href=\"tuuti.html\" class=\"botan\"><img src=\"images/bell.png\" class=\"aikon\"></a></li>\n");
      out.write("            <li><a href=\"me.html\" class=\"botan\"><img src=\"images/me.png\" class=\"aikon\"></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");

}else{

      out.write("\n");
      out.write("<p>認証NG</p>\n");
      out.write("<a href=\"index.jsp\">戻る</a>\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("\n");
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
