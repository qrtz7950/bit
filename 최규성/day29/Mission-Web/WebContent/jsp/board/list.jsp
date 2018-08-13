<%@page import="util.vo.BoardVO"%>
<%@page import="util.dao.BoardDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="util.JDBCClose" %>
<%@ page import="util.ConnectionFactory" %>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	/*
		작업순서 
		1. DB접속
		2. t_board 테이블에서 게시물 조회
		3. DB접속해제
		4. 화면에서 게시물 게시
	*/
	
	
	
	
	BoardDAO dao = new BoardDAO();
	List<BoardVO> boardList = dao.selectAll();
	
	//공유영역에 게시물집합 boardList등록
	pageContext.setAttribute("boardList", boardList);
%>





<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 목록 페이지</title>
<script>
	function gotoWriteForm(){
		location.href = "/Mission-Web/jsp/board/writeForm.jsp"
	}
</script>


<style>
	hr{
		width: 100%;
	}
	table{
		width: 100%;
	}
</style>




<link rel="stylesheet" href="/Mission-Web/css/layout.css" />
<link rel="stylesheet" href="/Mission-Web/css/board.css" />
</head>
<body>
	<header>
		<jsp:include page="/jsp/include/topMenu.jsp" />
	</header>
	<br><Br>
	<section><div align="center">
		<hr>
			<h2>게시판 목록</h2>
		<hr>
		<Br>
		<table border="1" style="width:100%;" id="list">
			<tr>
				<th width="7%">번호</th>
				<th>제목</th>
				<th width="16%">글쓴이</th>
				<th width="20%">등록일</th>
			</tr>
		<c:forEach items="${ boardList }" var="board">	
			<tr>
				<td>${board.no }</td>
				<td>
					<a href="detail.jsp?no=${board.no}">
						<c:out value="${board.title }"/>
					</a>
				</td>
				<td>${board.writer }</td>
				<td>${board.regDate }</td>
			</tr>
		</c:forEach>
		
		</table>
		<br>
		<br>
		<c:if test="${ not empty userVO }">
			<button onclick="gotoWriteForm()">새글 등록</button>
		</c:if>
	</div></section>
	<Br><Br>
	<footer>
		<%@ include file="/jsp/include/footer.jsp" %>
	</footer>
</body>
</html>


