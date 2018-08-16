<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="/Mission-Web/css/layout.css" />
<link rel="stylesheet" href="/Mission-Web/css/board.css" />
<script src="/Mission-Web/js/myCheck.js"></script>
<script>

	function checkForm(){
/* 
		if(document.lform.id.value == ''){
			alert("아이디를 입력하세요");
			document.lform.id.focus();
			return false;
		}
 */
 	var form = document.lform;
 
 	if(isNull(form.id, '아이디를 입력해주세요')){
 		return false;
 	}
 	
 	if(isNull(form.password, '패스워드를 입력해주세요')){
 		return false;
 	}
 	return true;
 	
 }
</script>
</head>
<body>
	<header>
		<jsp:include page="/jsp/include/topMenu.jsp" />
	</header>
	<br><br>
	<section>
		<div align="center">
			
			<hr>
			<h2>로그인</h2>
			<hr>
			<br>
			<form action="loginProcess.jsp" method="post" name="lform" onsubmit="return checkForm()">
				<table style="width:40%">
					<tr>
						<th>ID</th>
						<td><input type="text" name="id" size="20" autofocus></td>
					</tr>
					<tr>
						<th>Password</th>
						<td><input type="password" name="password" size="20"></td>
					</tr>
				</table>	
			<br>
			<input type="submit" value="로그인">		
			</form>
		</div>
	</section>
	<footer>
		<%@ include file="/jsp/include/footer.jsp" %>
	</footer>
</body>
</html>