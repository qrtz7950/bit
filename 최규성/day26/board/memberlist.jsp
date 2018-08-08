<%@ page import="util.ConnectionFactory" %>
<%@ page import="util.JDBCClose" %>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Connection conn = ConnectionFactory.getConnection();
	System.out.println("conn : " + conn);
	StringBuilder sql = new StringBuilder();
	sql.append("select no, title, writer, to_char(reg_date,'yyyy-mm-dd') as reg_date ");
	sql.append("	from t_board ");
	sql.append("  order by no desc ");
	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	ResultSet rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
			<hr>
				<h2>회원 목록</h2>
			<hr>
			<Br>
			<table border="1">
				<tr>
					
					<th>아이디</th>
					<th>비밀번호</th>
					<th>이메일</th>
					<th>이름</th>
					<th>연락처</th>
					<th>주소</th>
				</tr>
			<%
				while(rs.next()){
			%>
					<tr>
						<td><%= rs.getString("id") %></td>
						<td><%= rs.getString("password") %></td>
						<td><%= rs.getString("email") %></td>
						<td><%= rs.getString("name") %></td>
						<td><%= rs.getString("phone") %></td>
						<td><%= rs.getString("addr") %></td>
					</tr>
			<%
				}
			%>
			</table>
			<br>
			<br>
			<button onclick="gotoWriteForm()">새글 등록</button>
			<!-- <a href="/Mission-Web/board/writeForm.jsp">새글 등록</a> -->
		</div>
</body>
</html>