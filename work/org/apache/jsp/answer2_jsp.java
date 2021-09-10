package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.util.Calendar;

public final class answer2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

  String namaeStr =request.getParameter("NAMAE");
  String yuubinStr =request.getParameter("YUUBIN");
  String jyuusyoStr =request.getParameter("JYUUSYO");
  String telStr =request.getParameter("TEL");
  String seibetuStr =request.getParameter("SEIBETU");
  String nenStr =request.getParameter("NEN");
  String tukiStr =request.getParameter("TUKI");
  String hiStr =request.getParameter("HI");
  
  Date today = new Date();
  Calendar cal = Calendar.getInstance();
  cal.setTime(today);
  int set_yy = cal.get(Calendar.YEAR);
  int set_mm = cal.get(Calendar.MONTH) + 1;
  int set_dd = cal.get(Calendar.DATE);
  
  int yy =Integer.parseInt(nenStr);
  int mm =Integer.parseInt(tukiStr);
  int dd =Integer.parseInt(hiStr);
  
  int age = (set_yy - yy);
  String sei;

    if(set_mm < mm){
      age = (age - 1);
    }
    else if(set_mm <= mm && set_dd < dd){
      age = (age - 1);
    }
    else if(set_mm <= mm && set_dd >= dd){
      age = age;
    }
  else if(set_mm > mm){
    age = age;
  }
  
  if(seibetuStr.equals("0")){
    sei="男性";
  }else{
    sei="女性";
  }


  String[] un = new String[7];
  un[0] = "大吉";
  un[1] = "中吉";
  un[2] = "小吉";
  un[3] = "末吉";
  un[4] = "吉";
  un[5] = "凶";
  un[6] = "大凶";

  double luck = Math.floor(Math.random()*7);
  int i = (int) luck;



      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>answer</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <h1>入力確認画面</h1>\r\n");
      out.write("    <table border=\"1\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <th>項目名</th><th>内容</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>お名前</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      out.print( namaeStr );
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>郵便番号</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      out.print( yuubinStr );
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>住所</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      out.print( jyuusyoStr );
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>電話番号</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      out.print( telStr );
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>性別</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      out.print( sei );
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>生年月日</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      out.print( nenStr );
      out.write("年\r\n");
      out.write("          ");
      out.print( tukiStr );
      out.write("月\r\n");
      out.write("          ");
      out.print( hiStr );
      out.write("日\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>年齢</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      out.print( age );
      out.write("歳\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>今日の運勢</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      out.print( un[i] );
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"2\" align=\"center\">\r\n");
      out.write("          <a href=\"/JV16/question2.jsp\">戻る</a>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>　　　　　　　　　　　　　　　　　　　");
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
