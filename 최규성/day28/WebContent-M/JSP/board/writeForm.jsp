<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>새글 작성</title>
<script>
	function goList(){
		location.href = "list.jsp";
	}
	function doWrite(){
		
		var w= document.wForm;
		if(w.title.value ==""){
			alert('제목을 입력하세요');
			w.title.focus();
			return false;
		}
		if(w.writer.value ==""){
			alert('작성자를 입력하세요');
			w.writer.focus();
			return false;
		}
		if(w.content.value ==""){
			alert('내용을 입력하세요');
			w.content.focus();
			return false;
		}
		
		return true;
	}
	
</script>
<style></style>
</head>
<body>
	<div align="center">
		<hr width="80%">
			<h2>게시글 등록폼</h2>
		<hr width="80%">
		<br>
		<form action="write.jsp" method="post" onsubmit="return doWrite()">
			<table border="1" style="width: 80%";>
				<tr>
					<th width="23%">제목</th>
					<td>
						<input type="text" size="75" name="title">
					</td>
				</tr>
				<tr>
					<th>글쓴이</th>
					<td>
							<input type="text" size="50" name="writer">
					</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>
						<textarea rows="7" cols="50" name="content"></textarea>				
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="등록">&nbsp;
			<input type="button" value="목록" onclick="goList()">&nbsp;
		</form>
	</div>
</body>
</html>