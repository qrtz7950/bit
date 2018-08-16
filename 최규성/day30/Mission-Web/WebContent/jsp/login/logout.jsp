<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//설정된 세션을 삭제
	session.removeAttribute("userVO");
%>
<script>
	alert('로그아웃 되었습니다');
	location.href = "/Mission-Web";
</script>