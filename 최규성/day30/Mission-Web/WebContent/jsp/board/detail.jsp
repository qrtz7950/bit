<%@page import="util.vo.BoardFileVO"%>
<%@page import="java.util.List"%>
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
    	//조회수증가
    	dao.updateViewCnt(no);
    	
    	//게시글 조회(t_board)
    	BoardVO board = dao.selectByNo(no);
    	
    	//첨부파일 조회 (t_board_file)
    	List<BoardFileVO> fileList = dao.selectFileByNo(no);

		//공유영역 등록
		pageContext.setAttribute("board", board);
		pageContext.setAttribute("fileList", fileList);
    	
    	
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
			case '수정' :
				location.href = "updateForm.jsp?no=${param.no}";
				break;
			case '삭제' :
				if(confirm('게시물을 삭제하시겠습니까?')){
					location.href = "delete.jsp?no=${param.no}";
				}
				break;
			case '목록' :
				location.href = "list.jsp";
				break;
			}
		});
		
	});
</script>
<link rel="stylesheet" href="/Mission-Web/css/layout.css" />
<link rel="stylesheet" href="/Mission-Web/css/board.css" />
</head>
<body>
<header>
	<jsp:include page="/jsp/include/topMenu.jsp" />
</header>
	<Br><Br>
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
		<tr>
			<th>첨부파일</th>
			<td>
				<c:forEach items="${ fileList }" var="file">
					<a href="/Mission-Web/upload/${file.fileSaveName }">
						${ file.fileOriName }
					</a>
					(${ file.fileSize } bytes)<Br>
				</c:forEach>
			</td>
		</tr>
	</table>
	<Br><Br>
	<button>수정</button>&nbsp;
	<button>삭제</button>&nbsp;
	<button>목록</button>&nbsp;
	
	
	
	
</div>
</body>
</html>