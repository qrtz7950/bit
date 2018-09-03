<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<Hr>
	<h2>게시글 등록</h2>
	<hr>
	<br>
	<form:form method="post" commandName="boardVO">
		
	<table border="1" style="width:80%;">
		<tr>
			<th width="25%">제목</th>
			<td>
				<form:input path="title"/>
				<form:errors path="title"/>
			</td>
		</tr>
		<tr>
			<th width="25%">작성자</th>
			<td>
				<form:input path="writer" />
				<form:errors path="writer"/>
			</td>
		</tr>
		<tr>
			<th width="25%">내용</th>
			<td>
				<form:textarea path="content" rows="5" cols="5"/>
				<form:errors path="content"/>
			</td>
		</tr>
	</table>
	<input type="submit" value="등록">
	
	</form:form>
</body>
</html>