package org.apache.jsp.sakuhin.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("    <title>åç§°æªè¨­å®</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/roguin.css\">\n");
      out.write("    <!-- <script type=\"text/javascript\" src=\"roguin.js\"></script> -->\n");
      out.write("    <!-- <script src=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.js\"></script> -->\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <section class=\"forms-section\">\n");
      out.write("  <h1 class=\"section-title\">fit.</h1>\n");
      out.write("  <div class=\"forms\">\n");
      out.write("    <div class=\"form-wrapper is-active\">\n");
      out.write("      <button type=\"button\" class=\"switcher switcher-login\">\n");
      out.write("        Login\n");
      out.write("        <span class=\"underline\"></span>\n");
      out.write("      </button>\n");
      out.write("      <form class=\"form form-login\" method=\"post\" action=\"home.jsp\" >\n");
      out.write("        <fieldset>\n");
      out.write("          <legend>Please, enter your email and password for login.</legend>\n");
      out.write("          <div class=\"input-block\">\n");
      out.write("            <label for=\"login-email\">E-mail</label>\n");
      out.write("            <input id=\"login-email\" type=\"email\" name=\"mail\" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-block\">\n");
      out.write("            <label for=\"login-password\">Password</label>\n");
      out.write("            <input id=\"login-password\" type=\"password\" name=\"pas\" required>\n");
      out.write("          </div>\n");
      out.write("        </fieldset>\n");
      out.write("\n");
      out.write("        <button type=\"submit\" class=\"btn-login\">Login</button><!-- formã¿ã°ã®ä¸­ã®actionã¯buttonãããããæã®å¦ç -->\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-wrapper\">\n");
      out.write("      <button type=\"button\" class=\"switcher switcher-signup\">\n");
      out.write("        Sign Up\n");
      out.write("        <span class=\"underline\"></span>\n");
      out.write("      </button>\n");
      out.write("      <form class=\"form form-signup\">\n");
      out.write("        <fieldset>\n");
      out.write("          <legend>Please, enter your email, password and password confirmation for sign up.</legend>\n");
      out.write("          <div class=\"input-block\">\n");
      out.write("            <label for=\"signup-email\">E-mail</label>\n");
      out.write("            <input id=\"signup-email\" type=\"email\" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-block\">\n");
      out.write("            <label for=\"signup-password\">Password</label>\n");
      out.write("            <input id=\"signup-password\" type=\"password\" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-block\">\n");
      out.write("            <label for=\"signup-password-confirm\">Confirm password</label>\n");
      out.write("            <input id=\"signup-password-confirm\" type=\"password\" required>\n");
      out.write("          </div>\n");
      out.write("        </fieldset>\n");
      out.write("        <button type=\"submit\" class=\"btn-signup\"><a href=\"index.html\" class=\"roguin\">Continue</a></button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("  const switchers = [...document.querySelectorAll('.switcher')]\n");
      out.write("\n");
      out.write("switchers.forEach(item => {\n");
      out.write("  item.addEventListener('click', function() {\n");
      out.write("    switchers.forEach(item => item.parentElement.classList.remove('is-active'))\n");
      out.write("    this.parentElement.classList.add('is-active')\n");
      out.write("  })\n");
      out.write("})\n");
      out.write("</script>\n");
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
