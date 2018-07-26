package board.v2.u2.ui;

import board.v2.u2.vo.BoardVO;

public class SearchOneUI extends BaseUI  {
	
	public void execute() throws Exception {
		int no = scanInt("조회할 글번호를 입력하세요 : ");
		BoardVO board = new BoardVO();
		board.setNo(no);	
		
		// service 메서드 호출
		BoardVO result = service.selectOneBoard(board);
		
		// 화면에 결과 출력
		System.out.println(no + "번 게시글");
		System.out.println("--------------------------------------------------");
		if (result != null) {
			System.out.println("번  호 : " + result.getNo     ());
			System.out.println("글쓴이 : " + result.getWriter ());
			System.out.println("제  목 : " + result.getTitle  ());
			System.out.println("등록일 : " + result.getRegDate());
		} else {
			System.out.println(no + "번 게시물이 존재하지 않습니다.");
		}
		System.out.println("--------------------------------------------------");
	}
}
