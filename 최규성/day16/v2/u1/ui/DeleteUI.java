package board.v2.u1.ui;

import board.v2.u1.service.BoardService;
import board.v2.u1.vo.BoardVO;

public class DeleteUI extends BaseUI {

	private BoardService service;
	public DeleteUI () {
		service = new BoardService();
	}
	
	public void execute() throws Exception {
		int no = scanInt("삭제할 글번호를 입력하세요 : ");
		BoardVO board = new BoardVO();
		board.setNo(no);
		
		service.deleteBoard(board);
		
		System.out.println("게시글이 삭제되었습니다.\n");
	}
}
