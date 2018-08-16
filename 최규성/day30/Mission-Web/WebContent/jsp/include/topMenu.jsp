<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
	function addFavorite(){
		try{
			window.external.AddFavorite('http://localhost:8888/Mission-Web','첫번째 나의웹')
		} catch(e) {
			alert('현재 사용중인 브라우저 에서는 사용할 수 없습니다. \n크롬에서는 ctrl + d를 사용하세요. \n')
		}
		
	}
</script>
<table border="1" style="width:100%;">
	<tr>
		<td rowspan="2" style="width:150px; height:30px;">
			<a href="/Mission-Web/index.jsp">
				<img src="/Mission-Web/images/logo2.png" width=100px height=50px>
			</a>
		</td>
		<td align="right">
			<!-- <a href="javascript:window.external.AddFavorite('http://localhost:8888/Mission-Web', '첫번째')">즐겨찾기</a> -->
			<a href="#" onclick="addFavorite()">즐겨찾기</a>
			<c:if test="${ not empty userVO }">
				${ userVO.id }님으로 로그인 중...
			</c:if>
		</td>
	</tr>
	
	<tr>
		<td>
			<navi>
				<c:if test="${ userVO.type == 'S' }">
					<a href="/Mission-Web/jsp/board/memberlist.jsp">회원관리</a> || 
				</c:if>
				<a href="/Mission-Web/jsp/board/list.jsp">게시판</a> || 
				<c:choose>
					<c:when test="${empty userVO }">
						<a href="/Mission-Web/jsp/board/signUp.jsp">회원가입</a> || 
						<a href="/Mission-Web/jsp/login/login.jsp">로그인</a> || 
					</c:when>
					<c:otherwise>
						마이페이지 || 
						<a href="/Mission-Web/jsp/login/logout.jsp">로그아웃</a>
					</c:otherwise>
				</c:choose>
			</navi>
		</td>
	</tr>
	
</table>