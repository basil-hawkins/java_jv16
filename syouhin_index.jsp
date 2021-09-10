<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
		String logout =request.getParameter("logout");
		if(logout != null){
			//セッション変数を削除
			session.removeAttribute("login_name");
			}
			String session_name = (String)session.getAttribute("login_name");
			
			if(session_name != null)
			{
					response.sendRedirect("syouhin_main.jsp");		
					}
					
					
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta charset="utf-8">

    <title>ログイン画面</title>

<h1>商品管理　ログイン</h1>

  </head>
  

<main>

<body>
<br>

	<form method="post" action="syouhin_index_action.jsp">
	<table border="1">
	<tr>
	<td>
  会員ID</td>
  <td>
   <input type="text" name="id" size="50" maxlength="20">
   </td>
   </tr>
   <tr>
   <td>
 パスワード</td>
 <td>
   <input type="text" name="pas" size="50" maxlength="20">
   </td>
  </tr>
  <tr>
  		<td colspan="2" align="center">
  			<input type="submit" value="ログイン">
  			</td>
  	</tr>
  </table>

</form>
</body>
</html>
