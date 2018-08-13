<%@page import="util.vo.BoardVO"%>
<%@page import="util.dao.BoardDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="util.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%--
    	작업순서
    	1. 조회할 글번호(파라미터 no)얻어오기
    	2. 얻어온 글번호를 통해t_board테이블에서 해당 게시물 조회하기
    	3. 조회된 게시물을 브라우저에 출력
     --%>
     
    <%
    	int no = Integer.parseInt(request.getParameter("no"));
    
    	BoardDAO dao = new BoardDAO();
    	BoardVO board = dao.selectByNo(no);
    	
    	pageContext.setAttribute("board", board);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>상세페이지</title>
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
	$(document).ready(function(){
		/* $('button').eq(2).click(function(){
			location.href = "list.jsp";
		}) */
	
		$('button').click(function(){
			switch($(this).text()){
			case '입력' :
				location.href = "list.jsp";
				break;
			}
		});
	});
</script>
</head>
<body>
<div align="center">
	<Hr width="80%">
	<h2>게시판 상세</h2>
	<Hr width="80%">
	<br>
	<table border="1" style="width:80%">
		<tr>
			<th width="25%">번호</th>
			<td>${ board.no }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td><c:out value="${board.title }" /></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.writer }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><c:out value="${board.content }"/></td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${board.viewCnt }</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>${ board.regDate}</td>
		</tr>
	</table>
	<Br><Br>
	<button>수정</button>&nbsp;
	<button>삭제</button>&nbsp;
	<button>목록</button>&nbsp;
	
	
</div>
</body>
</html>