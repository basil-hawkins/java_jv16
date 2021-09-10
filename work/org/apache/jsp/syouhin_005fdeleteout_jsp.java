package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class syouhin_005fdeleteout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");

    String syouhin_no = request.getParameter("syouhin_no");
    
    Connection con = null;
    Statement stmt = null;
    StringBuffer SQL = null;
    ResultSet rs = null;

    String USER = "yudai";
    String PASSWORD = "yudai";
    String URL = "jdbc:mysql://localhost/nhs00305db";
    String DRIVER = "com.mysql.jdbc.Driver";

    StringBuffer ERMSG = null;

    int del_count = 0;
	
	
    try {
    
        Class.forName(DRIVER).newInstance();
        
        con = DriverManager.getConnection(URL,USER,PASSWORD);

        stmt = con.createStatement();
        
        SQL = new StringBuffer();

        SQL.append("delete from syou_tbl where syou_no =");
        SQL.append(syouhin_no);
        
        del_count = stmt.executeUpdate(SQL.toString());
            
    }
    catch (ClassNotFoundException e) {
        ERMSG = new StringBuffer();
        ERMSG.append(e.getMessage());
    }

    catch (SQLException e) {
        ERMSG = new StringBuffer();
        ERMSG.append(e.getMessage());
    }

    catch (Exception e) {
        ERMSG = new StringBuffer();
        ERMSG.append(e.getMessage());
    }

    finally {
        try {
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
	     catch(SQLException e) {
	         ERMSG = new StringBuffer();
	         ERMSG.append(e.getMessage());
	     }
    }


      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html public \"-//W3C//DTD HTML 4.01 Transitional//en\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>\r\n");
      out.write("        商品削除\r\n");
      out.write("    </title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

		if (del_count != 0) {

      out.write("\r\n");
      out.write("\t\t削除OK<br>\r\n");
      out.write("\t\t");
      out.print( del_count + "件  削除完了しました" );
      out.write('\r');
      out.write('\n');

        } else {

      out.write("\r\n");
      out.write("\t\t削除NG<br>\r\n");
      out.write("\t\t");
      out.print( "削除が失敗しました " );
      out.write('\r');
      out.write('\n');

        }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
 if(ERMSG != null) { 
      out.write("\r\n");
      out.write("    予期せぬエラーが発生しました。<br>\r\n");
      out.print( ERMSG );
      out.write(' ');
      out.write('\r');
      out.write('\n');
 } else { 
      out.write("\r\n");
      out.write("    ※エラーは発生しませんでした。<br>\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <form action=\"/JV16/syouhin_main.jsp\">\r\n");
      out.write("        <button>商品一覧に戻る</button>\r\n");
      out.write("    </form>\r\n");
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
