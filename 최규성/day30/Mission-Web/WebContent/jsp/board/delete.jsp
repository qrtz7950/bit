<%@page import="java.io.File"%>
<%@page import="util.vo.BoardFileVO"%>
<%@page import="java.util.List"%>
<%@page import="util.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	
	BoardDAO dao = new BoardDAO();
	
	//upload 폴더에서도 첨부된 파일삭제
	List<BoardFileVO> fileList = dao.selectFileByNo(no);
	for(BoardFileVO file: fileList){
		File f= new File("C:\\Users\\bit\\eclipse-workspace\\Webworkspace\\Mission-Web\\WebContent\\upload\\" + file.getFileSaveName());
		f.delete();
	}
	//첨부파일 삭제
	dao.deleteFiles(no);
	
	//게시물 삭제
	dao.delete(no);
%>

<script>
	alert('게시물 ${ param.no}번 삭제하였습니다')
	location.href="list.jsp";
</script>