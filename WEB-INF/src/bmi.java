import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class bmi extends HttpServlet{
	public void doPost(
			HttpServletRequest req,
			HttpServletResponse res )
	        throws ServletException,IOException{
		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();
		
		String namaeStr = req.getParameter("namae");
		String sintyouStr = req.getParameter("sintyou");
		String taijuuStr = req.getParameter("taijuu");
		
		float num1 = Float.parseFloat(sintyouStr);
		float num2 = Float.parseFloat(taijuuStr);
		
		float bmi = num2 / ((num1 / 100) * (num1 / 100));
		float hyoujun = (num1 / 100) * (num1 / 100) * 22;
		float ans = hyoujun - num2;
			
		//入力データの表示
				StringBuffer sb = new StringBuffer();
				sb.append("<HTML><BODY>");
				sb.append("bmi.java");
				sb.append("<CENTER><H1>");
				sb.append("bmi判定");
				sb.append("<br><br>");
				sb.append("<font color='deeppink'>");
				sb.append(namaeStr);
				sb.append("</font>");
				sb.append("さん");
				sb.append("<br>");
				sb.append("<br>");
				sb.append("身長");
				sb.append("<font color='deeppink'>");
				sb.append(sintyouStr);
				sb.append("</font>");
				sb.append("cm");
				sb.append("<br>");
				sb.append("体重");
				sb.append("<font color='deeppink'>");
				sb.append(taijuuStr);
				sb.append("</font>");
				sb.append("kg");
				sb.append("<br><br>");
				sb.append("BMI値:");
				sb.append(bmi);
				sb.append("<br>");
				sb.append("判定:");
				if(bmi < 18.5){
					sb.append("痩せています");
				}else if(bmi < 25.0){
					sb.append("標準です");
				}else{
					sb.append("太っています");
				}
				sb.append("<br>");
				sb.append("標準体重は");
				sb.append(hyoujun);
				sb.append("kgです");
				sb.append("<br>");
				sb.append("標準体重まで");
				sb.append(ans);
				sb.append("kgです");
				sb.append("</H1></center></body></html>");
				out.println(sb.toString());
	}
}
