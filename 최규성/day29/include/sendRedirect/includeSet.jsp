<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>결과화면</h2>
	
	<c:set var="id" value="${param.id }" scope="request" />
	
	<c:if test="${param.id == 'admin' }">
		<jsp:include page="admin.jsp" />
	</c:if>
	
	
	<c:if test="${param.id != 'admin' }">
		<jsp:include page="user.jsp">
			<jsp:param value="${param.id }" name="id" />
		</jsp:include>
	</c:if>
</body>
</html>