package board.v2.u1.ui;

import board.v2.u1.service.BoardService;
import board.v2.u1.vo.BoardVO;

public class SearchOneUI extends BaseUI  {
	
	private BoardService service;
	public SearchOneUI () {
		service = new BoardService();
	}
	
	public void execute() throws Exception {
		int no = scanInt("조회할 글번호를 입력하세요 : ");
		BoardVO board = new BoardVO();
		board.setNo(no);	
		
		// service 메서드 호출
		BoardVO result = service.selectOneBoard(board);
		
		// 화면에 결과 출력
		System.out.println(result.getNo() + "번 게시글");
		System.out.println("--------------------------------------------------");
		System.out.println("번  호 : " + result.getNo     ());
		System.out.println("글쓴이 : " + result.getWriter ());
		System.out.println("제  목 : " + result.getTitle  ());
		System.out.println("등록일 : " + result.getRegDate());
		System.out.println("--------------------------------------------------");
	}
}
