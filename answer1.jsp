p<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar"%>
<%
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
  
%>
<html>
  <head>
    <title>answer</title>
  </head>
  <body>
    <h1>入力確認画面</h1>
    <table border="1">
      <tr>
        <th>項目名</th><th>内容</th>
      </tr>
      <tr>
        <td>お名前</td>
        <td>
          <%= namaeStr %>
        </td>
      </tr>
      <tr>
        <td>郵便番号</td>
        <td>
          <%= yuubinStr %>
        </td>
      </tr>
      <tr>
        <td>住所</td>
        <td>
          <%= jyuusyoStr %>
        </td>
      </tr>
      <tr>
        <td>電話番号</td>
        <td>
          <%= telStr %>
        </td>
      </tr>
      <tr>
        <td>性別</td>
        <td>
          <%= sei %>
        </td>
      </tr>
      <tr>
        <td>生年月日</td>
        <td>
          <%= nenStr %>年
          <%= tukiStr %>月
          <%= hiStr %>日
        </td>
      </tr>
      <tr>
        <td>年齢</td>
        <td>
          <%= age %>歳
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <a href="/JV16/question1.jsp">戻る</a>
        </td>
      </tr>
    </table>
  </body>
</html>