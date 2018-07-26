package board.v2.u1.ui;

import board.v2.u1.service.BoardService;
import board.v2.u1.vo.BoardVO;

public class UpdateUI extends BaseUI {
	
	private BoardService service;
	public UpdateUI () {
		service = new BoardService();
	}
	
	public void execute() throws Exception {
		int no = scanInt("수정할 글번호를 입력하세요 : ");
		String title  = scanStr("변경할 제목을 입력하세요 : ");
		
		BoardVO board = new BoardVO();
		board.setNo(no);
		board.setTitle(title);
		
		service.updateBoard(board);
		
		System.out.println("게시글이 수정되었습니다.\n");
	}
}
