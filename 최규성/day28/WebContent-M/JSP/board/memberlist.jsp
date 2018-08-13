<%@page import="util.vo.MemberVO"%>
<%@page import="util.dao.MemberDAO"%>
<%@ page import="util.ConnectionFactory" %>
<%@ page import="util.JDBCClose" %>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원목록</title>
<script>
function goList(){
	location.href = "list.jsp";
}
</script>
<link rel="stylesheet" href="/Mission-Web/css/layout.css" />
<link rel="stylesheet" href="/Mission-Web/css/board.css" />
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
					<th>이메일</th>
					<th>이름</th>
					<th>연락처</th>
					<th>주소</th>
				</tr>
			
					<tr>
						<td>${member.id }</td>
						<td>${member.email }</td>
						<td>${member.name }</td>
						<td>${member.phone }</td>
						<td>${member.addr }</td>
						
				<%-- 	<td><%= rs.getString("id") %></td>
						<td><%= rs.getString("password") %></td>
						<td><%= rs.getString("email") %></td>
						<td><%= rs.getString("name") %></td>
						<td><%= rs.getString("phone") %></td>
						<td><%= rs.getString("addr") %></td> --%>
					</tr>
			
			</table>
			<br>
			<br>
			<input type="button" value="목록" onclick="goList()">&nbsp;
			<!-- <a href="/Mission-Web/board/writeForm.jsp">새글 등록</a> -->
		</div>
</body>
</html>