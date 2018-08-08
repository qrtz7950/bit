<%@page import="util.JDBCClose"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="util.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String email = request.getParameter("email");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	String addr = request.getParameter("addr");
	
	Connection conn = ConnectionFactory.getConnection();
	StringBuilder sql = new StringBuilder();
	sql.append("insert into t_member(id, password, email,name,phone,addr)");
	sql.append("	values(?,?,?,?,?,?)");
	
	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	pstmt.setString(1,id);
	pstmt.setString(2,password);
	pstmt.setString(3,email);
	pstmt.setString(4,name);
	pstmt.setString(5,phone);
	pstmt.setString(6,addr);
	
	pstmt.executeUpdate();
	
	JDBCClose.close(conn,pstmt);
%>

<script>
	alert('회원가입이 되었습니다.');
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>