<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<%= request.getContextPath() %>/board/list.do">전체 게시글 조회</a><br>
	<a href="<%= request.getContextPath() %>/board/writeForm.do">새글 등록</a><br>
</body>
</html>