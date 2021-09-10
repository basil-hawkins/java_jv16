import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class kokushi1 extends HttpServlet{
	public void doPost(
			HttpServletRequest req,
			HttpServletResponse res )
	        throws ServletException,IOException{
		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();
		
		String namaeStr = req.getParameter("namae");
		String gakunenStr = req.getParameter("gakunen");
		String gozenStr = req.getParameter("gozen");
		String gogoStr = req.getParameter("gogo");
		
		//入力データの表示
				StringBuffer sb = new StringBuffer();
				sb.append("<HTML><BODY>");
				sb.append("kokushi1.java");
				sb.append("<CENTER><H1>");
				sb.append("国家試験判定");
				sb.append("<br><br>");
				sb.append("あなたは");
				sb.append("<br><font color='deeppink'>");
				sb.append(gakunenStr);
				sb.append("</font>");
				sb.append("の");
				sb.append("<font color='deeppink'>");
				sb.append(namaeStr);
				sb.append("</font>");
				sb.append("さん");
				sb.append("<br>");
				sb.append("あなたの得点は");
				sb.append("<br>");
				sb.append("午前");
				sb.append("<font color='deeppink'>");
				sb.append(gozenStr);
				sb.append("</font>");
				sb.append("点");
				sb.append("　");
				sb.append("午後");
				sb.append("<font color='deeppink'>");
				sb.append(gogoStr);
				sb.append("</font>");
				sb.append("点");
				sb.append("　");
				sb.append("合計");
				int num1 = Integer.parseInt(gozenStr);
				int num2 = Integer.parseInt(gogoStr);
				int sum = num1+num2;
				sb.append(sum);
				sb.append("点");
				sb.append("<br>");
				if(num1 >= 65 && num2 >= 65 && sum>= 140){
					sb.append("判定結果は合格です");
				}else{
					sb.append("判定結果は不合格です");
				}
				sb.append("</H1></center></body></html>");
				out.println(sb.toString());
	}
}
