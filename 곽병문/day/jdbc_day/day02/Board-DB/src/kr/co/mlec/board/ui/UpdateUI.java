package kr.co.mlec.board.ui;

import kr.co.mlec.board.vo.BoardVO;

public class UpdateUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("수정할 글번호를 입력하세요 : ");
		String title = scanStr("수정할 제목을 입력하세요");
		
		BoardVO board = new BoardVO();
		board.setNo(no);
		board.setTitle(title);
		
		service.updateBoard(board);
		
		System.out.println("게시글을 수정하였습니다");
	}

}







