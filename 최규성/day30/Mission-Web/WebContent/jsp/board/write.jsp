<%@page import="util.vo.BoardFileVO"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Enumeration"%>
<%@page import="util.BitFileNamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="util.vo.BoardVO"%>
<%@page import="util.dao.BoardDAO"%>
<%@page import="util.JDBCClose"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="util.ConnectionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	작업 순서
	1. 사용자가 입력한 파라미터(제목,작성자,내용)을 추출온다 
	2. 추출한 파라미터를 t_board 테이블에 저장한다
	3. 결과메시지를 화면에 출력한 후 목록페이지로 이동한다.   
--%>
<%
	request.setCharacterEncoding("UTF-8");

	String saveFolder = "C:\\Users\\bit\\eclipse-workspace\\Webworkspace\\Mission-Web\\WebContent\\upload";

	MultipartRequest multi = new MultipartRequest(
			request,
			saveFolder,
			1024 * 1024 * 3,
			"utf-8",
			new BitFileNamePolicy()
	);
	
	//1. 게시물 저장(t_board)
	String title = multi.getParameter("title");
	String writer = multi.getParameter("writer");
	String content = multi.getParameter("content");
	
	BoardVO board = new BoardVO();
	board.setTitle(title);
	board.setWriter(writer);
	board.setContent(content);
	
	BoardDAO dao = new BoardDAO();
	// DB(t_board)에 저장할 게시물번호(seq_t_board_no) 조회 
	int no = dao.selectNo();
	board.setNo(no);
	
	dao.insert(board);
	
	
	//2. 첨부파일 저장(t_board_file)
		/*게시물번호 no
		   원래파일이름 fileOriName
		   저장파일이름 fileSaveName
		   파일크기 fileSize
		*/
	Enumeration files = multi.getFileNames();
	while(files.hasMoreElements()){
		String fileName = (String)files.nextElement();
		File f = multi.getFile(fileName);
		if(f != null){
			String fileOriName = multi.getOriginalFileName(fileName);
			String fileSaveName = multi.getFilesystemName(fileName);
			int fileSize = (int)f.length();
			
			BoardFileVO fileVO = new BoardFileVO();
			fileVO.setBoardNo(no);
			fileVO.setFileOriName(fileOriName);
			fileVO.setFileSaveName(fileSaveName);
			fileVO.setFileSize(fileSize);
			
			dao.insertFile(fileVO);
		}
		
	}
	
/* 
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	BoardVO board = new BoardVO();
	board.setTitle(title);
	board.setWriter(writer);
	board.setContent(content);
	
	BoardDAO dao = new BoardDAO();
	dao.insert(board);
 */	
	
%>

<script>
	alert('등록을 완료했습니다.');
	location.href = "list.jsp";
</script>
