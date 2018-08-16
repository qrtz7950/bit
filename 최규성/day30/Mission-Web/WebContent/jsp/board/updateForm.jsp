<%@page import="util.dao.BoardDAO"%>
<%@page import="util.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int no = Integer.parseInt(request.getParameter("no"));

	BoardDAO dao = new BoardDAO();
	BoardVO board = dao.selectByNo(no);
	
	pageContext.setAttribute("board", board);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>새글 작성</title>
<script>
	function goList(){
		location.href = "list.jsp";
	}
</script>
<script src="/Mission-Web/js/myCheck.js"></script>
<script>
	function goList(){
		location.href = "list.jsp";
	}
	function doWrite(){
		
		var w= document.wForm;
		
		if(isNull(w.title, '제목을 입력하세요')){
			return false;
		}
		/* if(w.title.value ==""){
			alert('제목을 입력하세요');
			w.title.focus();
			return false;
		} */
		/* if(isNull(w.writer, '작성자를 입력하세요')){
			return false;
		} */
		 
		if(w.writer.value ==""){
			alert('작성자를 입력하세요');
			w.writer.focus();
			return false;
		}
		/* if(isNull(w.content, '내용을 입력하세요')){
			return false;
		} */
		if(w.content.value ==""){
			alert('내용을 입력하세요');
			w.content.focus();
			return false;
		} 
		
		return true;
	}
	
</script>
<link rel="stylesheet" href="/Mission-Web/css/layout.css" />
<link rel="stylesheet" href="/Mission-Web/css/board.css" />
</head>
<body>
	<header>
		<jsp:include page="/jsp/include/topMenu.jsp" />
	</header>
	<section>
	<div align="center">
		<hr>
			<h2>게시글 등록폼</h2>
		<hr>
		<br>
		<form action="update.jsp" method="post">
			<input type="hidden" name="no" value="${ param.no }">
			<table border="1" style="width: 100%";>
				<tr>
					<th width="23%">제목</th>
					<td>
						<input type="text" size="75" name="title" value="${board.title }">
					</td>
				</tr>
				<tr>
					<th>글쓴이</th>
					<td>
						${ board.writer }
					</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>
						<textarea rows="7" cols="50" name="content"> ${ board.content } </textarea>				
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="수정">&nbsp;
			<input type="button" value="목록" onclick="goList()">&nbsp;
		</form>
	</div>
	</section>
	<footer>
		<%@ include file="/jsp/include/footer.jsp" %>
	</footer>
</body>
</html>