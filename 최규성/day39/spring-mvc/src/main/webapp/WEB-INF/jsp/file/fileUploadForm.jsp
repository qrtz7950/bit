<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>파일 업로드 테스드</h2>
	<form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/file/upload.do">
		<input type="text" name="id" value="test" /><br>
		<input type="file" name="attachFile1" /><br>
		<input type="file" name="attachFile2" /><br>
		<input type="submit" value="업로드" /><br>
	</form>
</body>
</html>