<%@page import="board.BoardVO"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//1. 자바빈즈 클래스 + 콜렉션
	/* BoardVO board = new BoardVO();
	board.setTitle("성공");
	
	List<BoardVO> boardlList = new ArrayList<>();
	boardlList.add(board);
	*/
	
	//2. 자바빈즈 클래스 + 배열객체
	/* BoardVO board = new BoardVO();
	board.setTitle("성공");
	
	BoardVO[] boardList = {board}; */
	
	//3. 맵 객체 + 배열 객체
	/* Map<String, String> board = new HashMap<>();
	board.put("title", "성공");
	
	Map[] boardList = {board}; */
	
	//4. 맵 객체 + 콜렉션
	Map<String, String> board = new HashMap<>();
	board.put("title", "성공");
	
	List boardList = new ArrayList();
	boardList.add(board);
	
	
	pageContext.setAttribute("boardList", boardList);	//4가지 방법 공통 문
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	성공/실패? : ${ boardList[0].title }<Br><!-- 성공을 출력하는 4가지의 방법 -->
</body>
</html>