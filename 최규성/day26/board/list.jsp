<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="util.JDBCClose" %>
<%@ page import="util.ConnectionFactory" %>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>

<%
	/*
		작업순서 
		1. DB접속
		2. t_board 테이블에서 게시물 조회
		3. 화면에서 게시물 게시
		4. DB접속해제
	*/
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
<title>게시판 목록 페이지</title>
<script>
	function gotoWriteForm(){
		location.href = "/Mission-Web/board/writeForm.jsp"
	}
</script>
<style>
	hr{
		width: 80%;
	}
</style>
</head>
<body>
	<div align="center">
		<hr>
			<h2>게시판 목록</h2>
		<hr>
		<Br>
		<table border="1">
			<tr>
				<th width="7%">번호</th>
				<th>제목</th>
				<th width="16%">글쓴이</th>
				<th width="20%">등록일</th>
			</tr>
		<%
			while(rs.next()){
		%>
				<tr>
					<td><%= rs.getInt("no") %></td>
					<td>
						<a href="detail.jsp?no=<%=rs.getInt("no")%>"><%= rs.getString("title") %></a>
					</td>
					<td><%= rs.getString("writer") %></td>
					<td><%= rs.getString("reg_date") %></td>
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
<%
	JDBCClose.close(conn, pstmt);

%>