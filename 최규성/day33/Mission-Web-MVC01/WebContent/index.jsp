<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<%= request.getContextPath() %>/board/list.do">전체 게시글 조회</a><br>
	<a href="<%= request.getContextPath() %>/board/writeForm.do">새글 등록</a><br>
	<c:if test="${ empty userVO }">
		<a href="<%= request.getContextPath() %>/login/login.do">로그인</a>
	</c:if>
		<c:if test="${ not empty userVO }">
	<a href="<%= request.getContextPath() %>/login/logout.do">로그아웃</a>
	</c:if>
</body>
</html>