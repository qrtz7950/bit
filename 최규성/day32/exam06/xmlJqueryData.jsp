<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="/Lecture-Web/jquery/js/jquery-3.3.1.min.js"></script>
<script src="httpRequest.js"></script>
<script>
	function sendOnClick() {
		
		sendProcess('GET', "sample.xml", null, callback);
	}
	
	function callback() {
		var msg = '';
		if(httpRequest.readyState == 4) {
			if(httpRequest.status == 200) {
				/* var xmlDoc = $.parseXML(httpRequest.responseText); */
				var xmlDoc = httpRequest.responseXML;
				var memberList = $(xmlDoc).find('member');
				msg += '회원수: ' + memberList.length + '명\n';
				
				memberList.each(function(index, data){
					var id = ($(this).find('id').html());
					var name = ($(this).find('id').html());
					msg += id + "(" + name +")\n";
					
				});
				
			}
		}
		debugTrace(msg);
	}
		
	
	
	function debugTrace(msg) {
		var debug = document.getElementById("debug");
		debug.value += msg;
	}	
</script>
</head>
<body>
	<h2>XML DATA 예제</h2>
	<br>
	<textarea rows="8" cols="50" id="debug"></textarea><br>
	<input type="button" value="서버에 자료요청" onclick="sendOnClick()">
</body>
</html>







