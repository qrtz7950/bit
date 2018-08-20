<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="httpRequest.js"></script>
<script>
	function sendOnClick() {
		
		sendProcess('GET', "sample.xml", null, callback);
	}
	
	function callback() {
		var msg = '';
		if(httpRequest.readyState == 4) {
			if(httpRequest.status == 200) {
				var data = httpRequest.responseXML;
				var memberList = data.getElementsByTagName("member");
				msg += '회원수: ' + memberList.length + '명\n';
				for(var i = 0; i< memberList.length; i++){
					var mem = memberList[i];
					var idTag = mem.getElementsByTagName("id");
					var id = idTag[0].innerHTML;
					var name = mem.getElementsByTagName("name")[0].firstChild.nodeValue;
					msg += id + "(" +name + ")\n"
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
	<h2>XML DATA 예제</h2>
	<br>
	<textarea rows="8" cols="50" id="debug"></textarea><br>
	<input type="button" value="서버에 자료요청" onclick="sendOnClick()">
</body>
</html>







