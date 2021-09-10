<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>

<%
		//文字コードの指定
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//データベースに接続するために使用する変数宣言
		Connection con = null;
		Statement stmt = null;
		StringBuffer SQL = null;
		ResultSet rs = null;
		
		//ローカルのMySQLに接続する設定
		String USER ="yudai";
		String PASSWORD ="yudai";
		String URL ="jdbc:mysql://localhost/nhs00305db";
		String DRIVER ="com.mysql.jdbc.Driver";
		
		//例外処理メッセージ
		StringBuffer ERMSG = null;
		
		String COMPMSG = null; 		//確認メッセージ
		String COMPPRO = null;
		boolean flg = true;
		
		//ログインページよりID,PASSの取得
		String cus_id =request.getParameter("id");
		String cus_pas = request.getParameter("pas");
		
		if(cus_id != "" && cus_pas != ""){
				try{
					//JDBCドライバのダウンロード
					Class.forName(DRIVER).newInstance();
					
					//Connectionオブジェクトの作成
					con = DriverManager.getConnection(URL,USER,PASSWORD);
					
					//Statementオブジェクトの作成
					stmt = con.createStatement();
					
					//SQLステートメントの作成(選択クエリ)
					SQL = new StringBuffer();
					SQL.append("select cus_name from cus_tbl ");
					SQL.append("where cus_id = '" + cus_id + "' and cus_pas = '" + cus_pas + "'");
				
					//SQL文の発行
					rs = stmt.executeQuery(SQL.toString());
					
					//読み込み確認
					if(rs.next() == true){   //ログインOK
							//有効期限30秒
							session.setMaxInactiveInterval(30);
							
							//セッションにバインド
							session.setAttribute("login_name" ,rs.getString("cus_name"));
							
							//メインページへ
							response.sendRedirect("syouhin_main.jsp");
					}else{   //ログインNG
						COMPMSG ="該当レコードは存在しません ";
					}
						}		//tryブロック終了
					catch(ClassNotFoundException e){
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
							//各種オブジェクトソース
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
			}else{
				COMPMSG="未入力項目があります";
			}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>認証処理</title>
</head>
<body>
<% if(ERMSG != null){ %>
予期せぬエラーが発生しました<br />
<%= ERMSG %>
<% }else{ %>
<%= COMPMSG %>
<% } %>
 	<form method = "post" action = " /JV16/syouhin_index.jsp">
		
 	<input type = "submit" value = "戻る">
 	
 	</form>

</body>
</html>
						