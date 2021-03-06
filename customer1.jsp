 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta http-equiv="content-Type" content="text/html;charset=UTF-8">
    <title>『顧客テーブルの内容を読み込みそのまま表示するプログラム』</title>
  </head>
  <body>
        <table border="1">
          <tr><th>顧客No.</th><th>顧客ID</th><th>パスワード</th><th>氏名</th></tr>
<%
          //文字コードの指定
          request.setCharacterEncoding("UTF-8");
          respponse.setCharacterEncoding("UTF-8");

          //データベースに接続するために使用する変数宣言
          Connection con = null;
          Statement stmt = null;
          StringBuffer SQL = null;
          ResultSet rs = null;

          //ローカルのMySQLに接続する設定
          String USER ="root";
          String PASSWORD = "root";
          String URL ="jdbc:mysql://192.168.121.16/nhs00305db";

          //サーバーのMySQLに接続する設定
          //String USER ="nhs00305";
          //String PASSWORD = "b20020129"
          //String URL ="jdbc:mysql://192.168.121.16/nhs00305db";

          String DRIVER = "com.mysql.jdbc.Driver";

          //JDBCドライバのロード
          Class.forName(DRIVER).newInstance();

          //Connectionオブジェクトの作成
          con = DriverManager.getConnection(URL,USER,PASSWORD);

          //Statmentオブジェクトの作成
          stmt = con.createStatment();

          //SQLステートメントの作成(選択クエリ)
          SQL = new StringBuffer();

          //SQL文の発行(選択クエリ)
          SQL.append("select * from cus_tbl");

          //SQL文の発行(選択クエリ)
          rs = stmt.executeQuery(SQL.toString());

          //抽出したデータを繰り返し処理で表示する。
          while(rs.next()){
          //観客NO(自動生成)
          out.println("<tr><td>" + rs.getString("cus_no")+ "</td>");
          //顧客ID(ログインID)
          out.println("<td>" + rs.getString("cus_id")+ "</td>");
          //顧客PW(ログインパスワード)
          out.println("<td>" + rs.getString("cus_pas")+ "</td>");
          //ハンドルネーム
          out.println("<td>" + rs.getString("cus_name")+ "</td>");
        }
        rs.close();
        stmt.close();
        con.close();
%>
        </table>
  </body>
</html>