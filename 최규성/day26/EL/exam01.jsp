<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	5 + 5 : <%= 5 + 5 %><Br>
	5 + 5 : ${5 + 5} <Br>
	9 % 5 : ${9 % 5}<Br>
	9 mod 5 : ${9 mod 5 }<br>
	9 > 5 : ${9 >5 }<br>
	9 gt 5 : ${9 gt 5 }<br>
	9 == 5 : ${ 9 ==5 }<br>
	9 eq 5 : ${ 9 eq 5 }<br>
	9 != 5 : ${ 9 != 5 }<br>
	9 ne 5 : ${ 9 ne 5 }<br>
	not(9 eq 5): ${not(9 eq 5) }<br>
	
	(5 ==5) && ( 6 > 4 ) : ${ (5 ==5) && ( 6 > 4 )} <Br>
	(5 eq 5) && ( 6 gt 4 ) : ${ (5 eq 5) && ( 6 gt 4 )} <Br>
	
	empty str: ${empty str }<br>
	not empty str : ${ not(empty str) }<Br>
	
	5의 짝/홀 판단: ${ 5 mod 2 eq 0 ? "짝수" : "홀수" }<br>
</body>
</html>