package kr.co.mlec.board;

import kr.co.mlec.board.ui.BoardUI;

/*
 	*** 메뉴 ***
 	1. 전체게시글 조회
 	2. 글번호  조회
 	3. 글등록
 	4. 글수정
 	5. 글삭제
 	0. 종료
 	항목을 선택하세요 : 1
 	게시글이 존재하지 않습니다
 	
 	*** 메뉴 ***
 	1. 전체게시글 조회
 	2. 글번호  조회
 	3. 글등록
 	4. 글수정
 	5. 글삭제
 	0. 종료
 	항목을 선택하세요 : 3
 	등록할 제목을 입력하세요 : aaa
 	등록할 내용을 입력하세요 : bbb
 	게시글을 등록하였습니다
 	
 	*** 메뉴 ***
 	1. 전체게시글 조회
 	2. 글번호  조회
 	3. 글등록
 	4. 글수정
 	5. 글삭제
 	0. 종료
 	항목을 선택하세요 : 1
 	
 	번호   제목   내용   등록일
 	1    aaa  bbb  2018-07-25
 */

public class BoardMain {

	public static void main(String[] args) {
		
		try {
			new BoardUI().execute();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}









