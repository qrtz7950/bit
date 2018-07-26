package board.v1.u5.ui;

/**
 * 사용자 화면 처리
 * @author bitacademy
 */
public class BoardUI extends BaseUI {
	
	public void execute() throws Exception {
		while(true) {
			System.out.println();
			String type = menu();
			IBoardUI ui = null;
			switch(type) {
			case "1" :
				ui = new SearchUI();      // 전체 게시글 조회화면
				break;
			case "2" :
				ui = new SearchOneUI();  // 게시글 번호로 조회화면
				break;
			case "3" :
				ui = new AddUI();               // 게시글 등록 화면처리 
				break;
			case "4" :
				ui = new UpdateUI();      // 게시글 수정화면
				break;
			case "5" :
				ui = new DeleteUI();      // 게시글 삭제화면
				break;
			case "0" :
				ui = new ExitUI();        // 게시판 프로그램 종료화면
			}    // end of switch block
			ui.execute();
		}	// end of while loop
	}  // end of process method
	
	private String menu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1. 전체게시물 조회   ");
		System.out.println("2. 글번호 조회   ");
		System.out.println("3. 글등록   ");
		System.out.println("4. 글수정   ");
		System.out.println("5. 글삭제   ");
		System.out.println("0. 종료     ");
		System.out.println("--------------------------------------------------");
		return scanStr("메뉴 중 처리할 항목을 선택하세요 : ");
	}
}















