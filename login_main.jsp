<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
        String session_name = (String)session.getAttribute("login_name");

        if(session_name != null)
        {
                            response.sendRedirect("login_main.jsp");
        }

%>
<!DOCTYPE html PUBLIC "-//W3C//DT3ix3xx44sD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>メインページ</title>	
</head>
<body>
              sessionID:<%= session.getId()%><br/>
              <h2>ようこそ! <%= session_name %>   さん</h2><br/>
              <br/>
              <form method="post" action="login_index.jsp">
                                <input type="hidden" name="logout" value="logout">
                                <input type="submit" value="ログアウト">
              </form>
</body>
</html>