<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	//入力データ送信
	String syou_msgStr = request.getParameter("syouhin_msg");
	String syou_preStr = request.getParameter("syouhin_pre");
	String syou_nameStr = request.getParameter("syouhin_name");
	String syou_iconStr = request.getParameter("syouhin_icon");
	String syou_noStr = request.getParameter("syouhin_no");
	
	//データベースに接続するために使用する変数宣言
	Connection con = null;
	Statement stmt = null;
	StringBuffer SQL = null;
	ResultSet rs = null;
	
	//ローカルのMysqlの接続する設定
	String USER = "yudai";
	String PASSWORD = "yudai";
	String URL = "jdbc:mysql://localhost/nhs00305db";
	String DRIVER = "com.mysql.jdbc.Driver";
	
	//確認メッセージ
	StringBuffer ERMSG = null;
	
	//ヒットフラグ
	int hit_flag = 0;
	
	//追加件数
	int ins_count = 0;
	
	try{	//ロードに失敗したときのための例外処理
			//JDBCドライバのロード
			Class.forName(DRIVER).newInstance();
					
			//Connectionオブジェクトの作成
			con = DriverManager.getConnection(URL,USER,PASSWORD);
	
			//Statementオブジェクトの作成
			stmt = con.createStatement();
					
			//SQLステートメントの作成(選択クエリー)
			SQL = new StringBuffer();
			
			//SQL文の構築（選択クエリー）
			SQL.append("select * from syou_tbl where syou_no = '");
			SQL.append(syou_noStr);
			SQL.append("'");
			System.out.println(SQL.toString());	
					
			//SQL文の実行(DB検索)
			rs = stmt.executeQuery(SQL.toString());
			
			//入力したデータがデータベースに存在するか調べる
			if(rs.next()){ //存在する（追加NG）
								//ヒットフラグON
								hit_flag = 1;
			}else{ //存在しない（追加OK）
							//ヒットフラグOFF
							hit_flag = 0;
							//SQLステートメントの作成（選択クエリー）
							SQL = new StringBuffer();
							
							//SQL文の構築（DB追加）
							SQL.append("insert into syou_tbl(syou_name,syou_pre,syou_msg,syou_icon)");
							SQL.append(" values('");
							SQL.append(syou_nameStr);
							SQL.append("','");
							SQL.append(syou_preStr);
							SQL.append("','");
							SQL.append(syou_msgStr);
							SQL.append("','");
							SQL.append(syou_iconStr);
							SQL.append("')");
							
					System.out.println(SQL.toString());
							
							//SQL文の実行（DB追加）
							ins_count = stmt.executeUpdate(SQL.toString());
							
			}
		}	//tryブロック終了
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

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<meta http-equiv="content-type" content="text/html;charset=UTF-8">
<TITLE>『顧客テーブルにレコードを追加するプログラム』</TITLE>
</HEAD>
<BODY>
<%
		if(hit_flag == 1){ //追加NG
%>
		追加NG<br>
		 <%= "入力された顧客IDは既に存在しています" %>
<%
		}else if(ins_count == 0){ //追加処理失敗
%>
		追加NG<br>
		 <%= "登録処理が失敗しました" %>
<%
		}else{ //認証OK
%>
		追加OK<br>
		 <%= ins_count + "件　登録が完了しました" %>
<%
		}
%>
<br><br>
<% if(ERMSG != null){ %>
予期せぬエラーが発生しました<br />
<%= ERMSG %>
<% }else{ %>
※エラーは発生しませんでした<br/>
<% } %>

  <form action="/JV16/syouhin_main.jsp">
        <button>商品一覧に戻る</button>
    </form>

</BODY>
</HTML>


  

  
  
  