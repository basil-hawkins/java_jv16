<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<%
  //文字コードの指定
  request.setCharacterEncoding("UTF-8");
  response.setCharacterEncoding("UTF-8");

  //データベースへ接続するために使用する変数宣言
  Connection con = null;
  Statement stmt = null;
  StringBuffer SQL = null;
  ResultSet rs =null;

  //ローカルのMySQLへ接続する設定
  String USER ="yudai";
  String PASSWORD = "yudai";
  String URL = "jdbc:mysql://localhost/fit";
  String DRIVER = "com.mysql.jdbc.Driver";

  //例外処理用メッセージ
  StringBuffer ERMSG = null;

  //ヒットフラグ
  int hit_flag = 0;

  //ログインページによりID,PASSの取得
  String user_mail = request.getParameter("mail");
  String user_pas = request.getParameter("pas");

                try{
                //JDBCドライバーのロード
                Class.forName(DRIVER).newInstance();

                //Connectionオブジェクトの作成
                con = DriverManager.getConnection(URL,USER,PASSWORD);

                //Statementオブジェクトの作成
                stmt = con.createStatement();

                //SQLステートメントの作成(選択クエリ)  
                SQL = new StringBuffer();
                SQL.append("select * from user where user_mail = '");
                SQL.append(user_mail);
                SQL.append("' and user_pas = '");
                SQL.append(user_pas);
                SQL.append("'");

                //SQL文の発行(選択クエリ)
                rs = stmt.executeQuery(SQL.toString());

                //読み込み確認
                if(rs.next()){         //ログインOK
               //ヒットフラグON
               hit_flag = 1;
                          }else{                      //ログインNG
                     //ヒットフラグOFF
                     hit_flag = 0;
                        }

              }             //tryブロック終了
catch(ClassNotFoundException e ){
ERMSG = new StringBuffer();
ERMSG.append(e.getMessage());
}
catch(SQLException e){
ERMSG = new StringBuffer();
ERMSG.append(e.getMessage());
}
catch(Exception e){
ERMSG = new StringBuffer();
ERMSG.append(e.getMessage());
}

finally{
//各種オブジェクトクローズ
try{
if(rs != null){
rs.close();
}
if(stmt != null){
   stmt.close();
}
if(con != null){
con.close();
}
}
catch(SQLException e){
ERMSG = new StringBuffer();
ERMSG.append(e.getMessage());
}
}
%>

<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>名称未設定</title>

    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/common.css">

    <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@600&display=swap" rel="stylesheet">

  </head>

  <body>
<%
 if(hit_flag == 1){
%>
    <div id="waku">

<div id="zentai">

      <table>
        <tr>
          <td><a href="taikei.html"><img src="images/taikei.png" alt="mitei" class="img1"></a></td>
          <td><a href="torendo.html"><img src="images/torendo.png" alt="mitei" class="img1"></a></td>
        </tr>
        <tr>
          <td><a href="shinsaku.html"><img src="images/shinsaku.png" alt="mitei" class="img1"></a></td>
          <td><a href="rankingu.html"><img src="images/rankingu.png" alt="mitei" class="img1"></a></td>
        </tr>
        <tr>
          <td><a href="bamen.html"><img src="images/bamen.png" alt="mitei" class="img1"></a></td>
          <td><a href="osusume.html"><img src="images/osusume.png" alt="mitei" class="img1"></a></td>
        </tr>
      </table>

      <table id="moderu">
        <tr>
          <td><a href="tanin.html"><img src="images/moderu1.jpg" alt="mitei" class="img2"></a></td>
          <td><a href="tanin.html"><img src="images/moderu2.jpg" alt="mitei" class="img2"></a></td>
        </tr>
        <tr>
          <td><a href="tanin.html"><img src="images/moderu2.jpg" alt="mitei" class="img2"></a></td>
          <td><a href="tanin.html"><img src="images/moderu1.jpg" alt="mitei" class="img2"></a></td>
        </tr>
      </table>

      
</div>
    </div>

      <header class="manyu">
        <nav>
          <ul>
            <li><a href="home.html" class="botan"><img src="images/home.png" class="aikon"></a></li>
            <li><a href="kensaku.html" class="botan"><img src="images/mushi.png" class="aikon"></a></li>
            <li><a href="tuuti.html" class="botan"><img src="images/bell.png" class="aikon"></a></li>
            <li><a href="me.html" class="botan"><img src="images/me.png" class="aikon"></a></li>
          </ul>
        </nav>
      </header>
<%
}else{
%>
<p>認証NG</p>
<a href="index.jsp">戻る</a>
<% } %>

  </body>

</html>