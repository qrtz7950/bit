<%@page import="board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardVO b = new BoardVO();

	b.setNo(1);
	b.setTitle("test");
	
	// pageContext영역에 객체를 등록
	// 이름: board   값: 생성된 BoardVO 객체 b
	pageContext.setAttribute("board", b);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	no : <%= b.getNo() %><Br>
	no : <%=((BoardVO)pageContext.getAttribute("board")).getNo() %><Br>
	
	title : <%= b.getTitle() %><Br>
	title : <%=((BoardVO)pageContext.getAttribute("board")).getTitle() %><Br>
	
	el no : ${ board.no }<Br>
	el title : ${ board.title }<br>
	
	<%-- el aaa : ${ board.aaa }<Br> --%>	<!-- getaaa메소드를 의미한다. 하지만 없기때문에 500Error 발생-->
</body>
</html>