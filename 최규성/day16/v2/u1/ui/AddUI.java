package board.v2.u1.ui;

import board.v2.u1.service.BoardService;
import board.v2.u1.vo.BoardVO;

public class AddUI extends BaseUI {
	private BoardService service;
	public AddUI () {
		service = new BoardService();
	}
	
	public void execute() throws Exception {
		String title  = scanStr("제목을 입력하세요 : ");
		String writer = scanStr("글쓴이를 입력하세요 : ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		
		service.insertBoard(board);
		
		System.out.println("게시글이 등록되었습니다.\n");
	}
}
