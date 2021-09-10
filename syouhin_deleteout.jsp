<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>

<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");

    String syouhin_no = request.getParameter("syouhin_no");
    
    Connection con = null;
    Statement stmt = null;
    StringBuffer SQL = null;
    ResultSet rs = null;

    String USER = "yudai";
    String PASSWORD = "yudai";
    String URL = "jdbc:mysql://localhost/nhs00305db";
    String DRIVER = "com.mysql.jdbc.Driver";

    StringBuffer ERMSG = null;

    int del_count = 0;
	
	
    try {
    
        Class.forName(DRIVER).newInstance();
        
        con = DriverManager.getConnection(URL,USER,PASSWORD);

        stmt = con.createStatement();
        
        SQL = new StringBuffer();

        SQL.append("delete from syou_tbl where syou_no =");
        SQL.append(syouhin_no);
        
        del_count = stmt.executeUpdate(SQL.toString());
            
    }
    catch (ClassNotFoundException e) {
        ERMSG = new StringBuffer();
        ERMSG.append(e.getMessage());
    }

    catch (SQLException e) {
        ERMSG = new StringBuffer();
        ERMSG.append(e.getMessage());
    }

    catch (Exception e) {
        ERMSG = new StringBuffer();
        ERMSG.append(e.getMessage());
    }

    finally {
        try {
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
	     catch(SQLException e) {
	         ERMSG = new StringBuffer();
	         ERMSG.append(e.getMessage());
	     }
    }

%>

<!DOCTYPE html public "-//W3C//DTD HTML 4.01 Transitional//en" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>
        商品削除
    </title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
</head>
<body>

<%
		if (del_count != 0) {
%>
		削除OK<br>
		<%= del_count + "件  削除完了しました" %>
<%
        } else {
%>
		削除NG<br>
		<%= "削除が失敗しました " %>
<%
        }
%>

<br><br>

<% if(ERMSG != null) { %>
    予期せぬエラーが発生しました。<br>
<%= ERMSG %> 
<% } else { %>
    ※エラーは発生しませんでした。<br>
<% } %>

    <form action="/JV16/syouhin_main.jsp">
        <button>商品一覧に戻る</button>
    </form>

</body>
</html>