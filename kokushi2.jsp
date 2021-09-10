<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<%
  String namaeStr = request.getParameter("NAMAE");
  String gakunenStr = request.getParameter("GAKUNEN");
  String gozenStr = request.getParameter("GOZEN");
  String gogoStr = request.getParameter("GOGO");
  
 int num1 = Integer.parseInt(gozenStr);
 int num2 = Integer.parseInt(gogoStr);
	int goukei = num1 + num2;
%>
<HTML>
 <HEAD><TITLE>kokushi2
 m.jsp</TITLE>
 </HEAD>
 <BODY>
  kokushi2.jsp
  <CENTER><H1>国家試験判定
  <BR><BR>
  <FONT COLOR='deeppink'>
  <%= gakunenStr %>
  </FONT>の
  <FONT COLOR='deeppink'>
  <%= namaeStr %>
  </FONT>さん
  <BR>あなたの得点は
  <BR>午前
  <FONT COLOR='deeppink'>
  <%= gozenStr %>
  </FONT>点　午後
  <FONT COLOR='deeppink'>
  <%= gogoStr %>
  </FONT>点　合計
  <FONT COLOR='deeppink'>
  <%= goukei %>
  </FONT>点
  <BR>
 <% if(num1 >=65 && num2 >= 65 && goukei >= 140){%>
	 判定結果は<FONT COLOR='deeppink'>合格</FONT>です
 <% }else{ %>
	 判定結果は<FONT COLOR='deeppink'>不合格</FONT>です"
 <% } %>
  </H1>
  </CENTER>
 </BODY>
</HTML>
  
  

  
  
  