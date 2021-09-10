package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_005finsertin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC\"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
 request.setCharacterEncoding("UTF-8");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>顧客登録</TITLE>\r\n");
      out.write("<META HTTP-EQUIV=\"content-type\" CONTENT=\"text/html;charset=UTF-8\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY BGCOLOR=\"#FFFFFF\">\r\n");
      out.write("customer_insertin.jsp\r\n");
      out.write("<BR><Br>\r\n");
      out.write("顧客登録\r\n");
      out.write("<BR><Br>\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"/JV16/customer_insertout.jsp\">\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("        <th>項目名</th><th>内容</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("         <td>顧客ID</td>\r\n");
      out.write("         <td>\r\n");
      out.write("           <INPUT TYPE=\"text\" NAME=\"cus_id\" size=\"40\" maxlength=\"20\">\r\n");
      out.write("         </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("         <td>パスワード</td>\r\n");
      out.write("         <td>\r\n");
      out.write("            <INPUT TYPE=\"text\" NAME=\"cus_pas\" size=\"41\" maxlength=\"20\">\r\n");
      out.write("         </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("         <td>氏名</td>\r\n");
      out.write("         <td>\r\n");
      out.write("            <INPUT TYPE=\"text\" NAME=\"cus_name\" size=\"40\" maxlength=\"20\">\r\n");
      out.write("         </td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("  <BR><BR><HR>\r\n");
      out.write("  <INPUT TYPE=\"SUBMIT\" VALUE=\"送信\">\r\n");
      out.write("  <INPUT TYPE=\"RESET\" VALUE=\"入力クリア\">\r\n");
      out.write("</FORM>\r\n");
      out.write("</BODY>\r\n");
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
