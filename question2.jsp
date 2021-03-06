<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
  <head>
    <title>JSPへデータ送信</title>
    <meta http-equiv="content-Type" content="text/html;charset=UTF-8">
  </head>
  <body>
    <h1>アンケート画面</h1>
      <form method="post" action="/JV16/answer2.jsp">
        <table border="1">
          <tr>
            <th>項目名</th><th>内容</th>
          </tr>
          <tr>
            <td>お名前</td>
            <td>
              <input type="text" name="NAMAE" size="40" maxlength="20">
            </td>
          </tr>
          <tr>
            <td>郵便番号</td>
            <td>
              <input type="text" name="YUUBIN" size="40" maxlength="20">
            </td>
          </tr>
          <tr>
            <td>住所</td>
            <td>
              <input type="text" name="JYUUSYO" size="40" maxlength="20">
            </td>
          </tr>
          <tr>
            <td>電話番号</td>
            <td>
              <input type="text" name="TEL" size="40" maxlength="20">
            </td>
          </tr>
          <tr>
            <td>性別</td>
            <td>
              <input type="radio" name="SEIBETU" value="0" checked />男性
              <input type="radio" name="SEIBETU" value="1">女性
            </td>
          </tr>
          <tr>
            <td>生年月日(年)</td>
            <td>
              <input type="text" name="NEN" size="40" maxlength="8">
            </td>
          </tr>
          <tr>
            <td>生年月日(月)</td>
            <td>
              <input type="text" name="TUKI" size="40" maxlength="8">
            </td>
          </tr>
          <tr>
            <td>生年月日(日)</td>
            <td>
              <input type="text" name="HI" size="40" maxlength="8">
            </td>
          </tr>
          <tr>
            <td colspan="2" align="center">
              <input type="submit" value="送信する" />
            </td>
          </tr>
        </table>
      </form>
  </body>
</html>