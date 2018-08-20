<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	#msgView {
		width: 500px;
		height: 200px;
		border: 1px solid red;
	}
</style>
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
	/*
		type : 메소드(문자열)
		url  : 요청 주소(문자열)
		data : 파라미터(문자열, json(자바스크립트 객체))
		success : 수신성공(함수) (readyState 4, status 200 일때)
		error : 수신 실패(함수)
		async : 동기 / 비동기 설정 (기본값=비동기)
	*/
	$(document).ready(function() {
		$(':button').click(function(){
			$.ajax({
				type : 'get',
				url : 'hello.jsp',
				success : function(data){
				//	$('#msgView').html(data);
					$('#msgView').append(data);
					
				}
			});
		});
	});
</script>
</head>
<body>
	<h2>서버에서 받은 메세지</h2>
	<div id="msgView"></div>
	<br>
	<input type="button" value="서버에 자료요청" >
</body>
</html>