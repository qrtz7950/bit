<%@page import="java.util.List"%>
<%@page import="kr.co.mlec.member.vo.MemberVO"%>
<%@page import="kr.co.mlec.member.dao.MemberDAO"%>
<%@ page import="util.ConnectionFactory" %>
<%@ page import="util.JDBCClose" %>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	MemberDAO dao = new MemberDAO();
	List<MemberVO> memberList = dao.selectAll();
	
	//공유영역에 게시물집합 memberList등록
	pageContext.setAttribute("memberList", memberList);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원목록</title>
<script>
function goList(){
	location.href = "memberList.jsp";
}
function toggle(){
	var infos = document.inputForm.info;
	var cnt = 0;
	for(var i =0; i < infos.length; i++){
		if(infos[i].checked){
			cnt++;
		}
	}
	var check=true;
	if(cnt== infos.length){
		check = false;
	}
	for(var i =0; i < infos.length; i++){
		infos[i].checked = check;
	}
}
</script>
<link rel="stylesheet" href="/Mission-Web/css/layout.css" />
<link rel="stylesheet" href="/Mission-Web/css/board.css" />
</head>
<body>
	<div align="center">
			<hr>
				<h2>회원 목록</h2>
			<hr>
			<Br>
		<form name="inputForm">
			<table border="1" style="width:90%;">
				<tr name="info">
					<th width="8%"><input type="checkbox" onclick="toggle()"></th>
					<th>아이디</th>
					<th>이름</th>
					<th>연락처</th>
					<th>주소</th>
					<th>이메일</th>
					<th>등급</th>
				</tr>
			
			<c:forEach items="${ memberList }" var="member">	
				<tr>
						<td align="center"><input type="checkbox" name="info" onclick="check"></td>
						<td>${member.id }</td>
						<td>${member.name }</td>
						<td>${member.phone }</td>
						<td>${member.addr }</td>
						<td>${member.email }</td>
						<td>${member.type }</td>
				</tr>
			</c:forEach>
					
			
			</table>
			<input type="submit" name="manage" value="삭제">		
			<input type="submit" name="manage" value="등업">
			<input type="submit" name="manage" value="강등">
		</form>
			<br>
			<br>
			<input type="button" value="목록" onclick="goList()">&nbsp;
			<!-- <a href="/Mission-Web/board/writeForm.jsp">새글 등록</a> -->
		</div>
</body>
</html>