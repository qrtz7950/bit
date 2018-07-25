package kr.co.mlec.board.ui;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

public class AddUI extends BaseUI  {


	@Override
	public void execute() throws Exception {

		String title = scanStr("등록할 제목을 입력하세요 : ");
		String writer = scanStr("등록할 글쓴이를 입력하세요 : ");
		
		// BoardDAO의 boardList에 BoardVO객체 추가
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		service.insertBoard(board);

		
		System.out.println("게시글을 등록하였습니다");
	}

	
}
