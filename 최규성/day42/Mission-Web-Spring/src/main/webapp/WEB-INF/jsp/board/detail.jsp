<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
	<div align="center">
		<Hr width="80%">
		<h2>게시판 상세</h2>
		<Hr width="80%">
		<br>
		<table border="1" style="width: 80%">
			<tr>
				<th width="25%">번호</th>
				<td>${ board.no }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td><c:out value="${board.title }" /></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${board.writer }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td><c:out value="${board.content }" /></td>
			</tr>
			<tr>
				<th>조회수</th>
				<td>${board.viewCnt }</td>
			</tr>
			<tr>
				<th>등록일</th>
				<td>${ board.regDate}</td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td><c:forEach items="${ fileList }" var="file">
						<a href="/Mission-Web/upload/${file.fileSaveName }"> ${ file.fileOriName }
						</a>
					(${ file.fileSize } bytes)<Br>
					</c:forEach></td>
			</tr>
		</table>
		<Br>
		<Br>
		<button>수정</button>
		&nbsp;
		<button>삭제</button>
		&nbsp;
		<button>목록</button>
		&nbsp;




	</div>
	</section>
</body>
</html>