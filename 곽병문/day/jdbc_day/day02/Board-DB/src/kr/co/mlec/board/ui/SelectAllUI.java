package kr.co.mlec.board.ui;

import java.util.List;

import kr.co.mlec.board.vo.BoardVO;

/*
 	alt + shift + s 누른 후  v선택 : override
 */
public class SelectAllUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		List<BoardVO> boardList = service.selectAllBoard();
		
		System.out.println("게시물 목록 : " + boardList.size() + "개");
		System.out.println("------------------------------------");
		System.out.println("번호\t글쓴이\t등록일\t제목");
		System.out.println("------------------------------------");
		if(boardList.isEmpty()) {
			System.out.println("\t등록된 게시물이 없습니다");
		} else {
			for (BoardVO board : boardList) {
				System.out.println(
						board.getNo() + "\t" + board.getWriter() + "\t" + board.getRegDate() + "\t" + board.getTitle());
			}
		}
		System.out.println("------------------------------------");
	}
	
}






