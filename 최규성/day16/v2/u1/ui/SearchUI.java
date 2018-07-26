package board.v2.u1.ui;

import java.util.ArrayList;

import board.v2.u1.service.BoardService;
import board.v2.u1.vo.BoardVO;

public class SearchUI extends BaseUI  {

	private BoardService service;
	public SearchUI () {
		service = new BoardService();
	}
	
	public void execute() throws Exception {
		// service 메서드 호출
		ArrayList<BoardVO> list = service.selectBoard();
		
		// 화면에 결과 출력
		System.out.printf("게시글 목록 : 전체 %d개\n", list.size());
		System.out.println("--------------------------------------------------");
		System.out.println("번호\t글쓴이\t등록일\t제목");
		System.out.println("--------------------------------------------------");
		for (BoardVO board : list) {
			System.out.print(board.getNo     () + "\t");
			System.out.print(board.getWriter () + "\t");
			System.out.print(board.getRegDate() + "\t");
			System.out.print(board.getTitle  () + "\n");
		}
		
		if (list.isEmpty()) {
			System.out.println("조회된 게시물이 없습니다.");
		}
		System.out.println("--------------------------------------------------");
	}
}
