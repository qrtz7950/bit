<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="httpRequest.js"></script>
<script>
	function sendOnClick(){
		sendProcess('GET',"sample.jsp", null, callback);
	}
	
	function callback(){
		var msg= '';
		if(httpRequest.readyState ==4){
			if(httpRequest.status ==200){
				var data = httpRequest.responseText;
		//		var memberList = eval(data);
				var memberList = JSON.parse(data);
				
				msg += '회원수: ' + memberList.length + '명\n';
				for(var i = 0; i< memberList.length; i++){
					var mem = memberList[i];
					var id = mem.id;
					var name = mem.name;
					msg += id + '(' + name +')' + '\n';
				}
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
	<h2>JSON DATA 예제</h2><br>
	<textarea row="8" cols="50" id="debug"></textarea><Br>
	<input type="button" value="서버에 자료요청" onclick="sendOnClick()"> 
</body>
</html>