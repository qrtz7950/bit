<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<a href="<%= request.getContextPath() %>">마이홈</a>
	<a href="<%= request.getContextPath() %>/board/list.do">게시판</a>
	
	<c:choose>
		<c:when test="${ empty userVO }">
			<a href="${ pageContext.request.contextPath }/login/login.do">로그인</a>
			<a href="${ pageContext.request.contextPath }/member/signup.do">회원가입</a>
			
		</c:when>
		
		<c:otherwise>
			<a href="${ pageContext.request.contextPath }/board/write.do">새글등록</a>
			<a href="${ pageContext.request.contextPath }/member/memberlist.do">회원 목록</a>
			<a href="${ pageContext.request.contextPath }/login/logout.do">로그아웃</a><br>
		</c:otherwise>
	</c:choose>
