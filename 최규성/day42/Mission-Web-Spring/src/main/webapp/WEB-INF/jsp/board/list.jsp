<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<section><div align="center">
		<hr>
			<h2>게시판 목록</h2>
		<hr>
		<Br>
		<table border="1" style="width:100%;" id="list">
			<tr>
				<th width="7%">번호</th>
				<th>제목</th>
				<th width="16%">글쓴이</th>
				<th width="20%">등록일</th>
			</tr>
		<c:forEach items="${ boardList }" var="board"  varStatus="loop">	
			<tr <c:if test="${ loop.count % 2 eq 0 }">class="even"</c:if>>
				<td>${board.no }</td>
				<td>
					<a href="${pageContext.request.contextPath}/board/${board.no}/detail.do">
						<c:out value="${board.title }" />
					</a>
				</td>
				<td>${board.writer }</td>
				<td>${board.regDate }</td>
			</tr>
		</c:forEach>
		
		</table>
		<br>
		<br>
		<c:if test="${ not empty userVO }">
			<button onclick="gotoWriteForm()">새글 등록</button>
		</c:if>
	</div>
</section>
</body>
</html>