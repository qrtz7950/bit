<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "common.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="id" value="hong" scope="request" />
	id : ${ id }<br>

	msg: <%= msg %>
	
	phone:${phone}<Br>
	<h2>인클루드전</h2>
		<%-- <%@ include file ="one.jsp" %> --%>
		
		파라미터 미설정
		<c:import url="one.jsp" />
		
		 파라미터 설정
		 <c:import url="one.jsp">
		 	<c:param name="name" value="hong, gil-dong"/>
		 	<c:param value="24" name="age"/>
		 </c:import>
			
	phone:${phone}<Br>
	<h2>인클루드후</h2>
</body>
</html>