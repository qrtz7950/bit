<%@page import="util.dao.BoardDAO"%>
<%@page import="util.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

	String title = request.getParameter("title");
	String content = request.getParameter("content");
	int no = Integer.parseInt(request.getParameter("no"));
	
	BoardVO board = new BoardVO();
	board.setTitle(title);
	board.setContent(content);
	board.setNo(no);
	
	BoardDAO dao = new BoardDAO();
	dao.update(board);
	
%>

<script>
	alert('게시글 ${ param.no } 번 수정을 완료하였습니다.');
	location.href = "detail.jsp?no=${param.no}";
</script>