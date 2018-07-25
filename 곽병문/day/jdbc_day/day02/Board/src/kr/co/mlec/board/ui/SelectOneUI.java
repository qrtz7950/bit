package kr.co.mlec.board.ui;

import kr.co.mlec.board.vo.BoardVO;

public class SelectOneUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("조회할 글번호를 입력하세요 : ");
		BoardVO board = service.selectBoard(no);
		
		if(board == null) {
			System.out.println("입력하신 게시물 [" + no + "]번에 해당데이터가 없습니다");
		} else {
		
		System.out.println("-----------------------------------");
		System.out.println("\t\t검색결과");
		System.out.println("-----------------------------------");
		System.out.println("번  호 : " + board.getNo());
		System.out.println("제  목 : " + board.getTitle());
		System.out.println("글쓴이 : " + board.getWriter());
		System.out.println("조회수 : " + board.getViewCnt());
		System.out.println("등록일: " + board.getRegDate());
		System.out.println("-----------------------------------");
		}
		
	}

}
