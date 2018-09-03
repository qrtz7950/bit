<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/hello/hello.do">hello</a><br>
	<a href="${pageContext.request.contextPath }/method/method.do">method</a><br>
	<a href="${pageContext.request.contextPath }/form/joinForm.do">form</a><br>
	<a href="${pageContext.request.contextPath }/ajax/resBody.do">문자열 응답</a><br>
	<a href="${pageContext.request.contextPath }/ajax/resBody.json">JSON 응답</a><br>
	<a href="${pageContext.request.contextPath }/ajax/resVOBody.json">JSON VO객체 응답</a><br>
	<a href="${pageContext.request.contextPath }/ajax/resStringListBody.json">JSON List(문자열) 응답</a><br>
	<a href="${pageContext.request.contextPath }/ajax/resVOListBody.json">JSON List(VO) 응답</a><br>
	<hr>
	<a href="${pageContext.request.contextPath }/ajax/restBody.do">문자열 응답</a><br>
	<a href="${pageContext.request.contextPath }/ajax/restBody.json">JSON 응답</a><br>
	<a href="${pageContext.request.contextPath }/ajax/restVOBody.json">JSON VO객체 응답</a><br>
	<a href="${pageContext.request.contextPath }/ajax/restStringListBody.json">JSON List(문자열) 응답</a><br>
	<a href="${pageContext.request.contextPath }/ajax/restVOListBody.json">JSON List(VO) 응답</a><br>
	<hr>
	<a href="${ pageContext.request.contextPath }/file/uploadForm.do">파일 업로드</a>
	
</body>
</html>