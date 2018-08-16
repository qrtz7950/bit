<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>새글 작성</title>
<script src="/Mission-Web/js/myCheck.js"></script>
<script>
	<c:if test="${ empty userVO}">
		location.href= "/Mission-Web/jsp/login/login.jsp";
	</c:if>

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
	
		/* if(isNull(w.content, '내용을 입력하세요')){
			return false;
		} */
		if(w.content.value ==""){
			alert('내용을 입력하세요');
			w.content.focus();
			return false;
		} 
		
		//파일 확장자 체크
		if(checkExt(w.attachfile1)){
			return false;	
		}
		
		if(checkExt(w.attachfile2)){
			return false;
		}
		
		return true;
	}
	
	function checkExt(obj){
		var forbid = ['exe','java' , 'jsp', 'js', 'class'];
		var fileName = obj.value;
		var ext = fileName.subString(fileName.lastIndexOf('.')+1);
		
		for(var i = 0; i < forbid.length; i++){
			if(forbid[i] === ext) {
				alert(ext + '확장자는 파일업로드 정책에 위배됩니다');
				return true;
			}
		}
		
		return false;
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
		<hr width="80%">
			<h2>게시글 등록폼</h2>
		<hr width="80%">
		<br>
		<form name="wForm" action="write.jsp" method="post" onsubmit="return doWrite()" enctype="multipart/form-data">
			<input type="hidden" name="writer" value="${ userVO.id }">
			<table border="1" style="width: 110%";>
				<tr>
					<th width="23%">제목</th>
					<td>
						<input type="text" size="75" name="title">
					</td>
				</tr>
				<tr>
					<th>글쓴이</th>
					<td>
						${ userVO.id }
						<%-- <input type="text" size="50" name="writer" value="${userVO.id }" readonly > --%>
					</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>
						<textarea rows="7" cols="50" name="content"></textarea>				
					</td>
				</tr>
				<tr>
					<th>첨부파일</th>
					<td>
						<input type="file" name="attachfile1">				
						<input type="file" name="attachfile2">				
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="등록">&nbsp;
			<input type="button" value="목록" onclick="goList()">&nbsp;
		</form>
	</div>
	</section>
	<footer>
		<%@ include file="/jsp/include/footer.jsp" %>
	</footer>
</body>
</html>