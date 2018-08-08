<%@page import="util.JDBCClose"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="util.ConnectionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	작업 순서
	1. 사용자가 입력한 파라미터(제목,작성자,내용)을 추출온다 
	2. 추출한 파라미터를 t_board 테이블에 저장한다
	3. 결과메시지를 화면에 출력한 후 목록페이지로 이동한다.   
--%>
<%
	request.setCharacterEncoding("UTF-8");

	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	Connection conn = ConnectionFactory.getConnection();
	StringBuilder sql = new StringBuilder();
	sql.append("insert into t_board(no,title,writer,content)");
	sql.append("	values(seq_t_board_no.nextval,?,?,?)");
	
	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	pstmt.setString(1,title);
	pstmt.setString(2,writer);
	pstmt.setString(3,content);
	
	pstmt.executeUpdate();
	
	JDBCClose.close(conn,pstmt);
%>

<script>
	alert('등록을 완료했습니다.');
	location.href = "list.jsp";
</script>
<%--
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function goList(){
		location.href = "list.jsp";
	}
</script>
</head>
<body>
	<h2>새글 등록을 완료하였습니다</h2>
	<button onclick="goList()">목록이동</button>
</body>
</html>
--%>