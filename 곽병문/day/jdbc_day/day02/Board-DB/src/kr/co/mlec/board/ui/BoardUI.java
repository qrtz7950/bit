package kr.co.mlec.board.ui;

public class BoardUI extends BaseUI {
	
	public void execute() throws Exception {
		
		IBoardUI ui = null;
		while(true) {
			int type = menu();
			switch (type) {
			case 1:
				ui = new SelectAllUI();
				break;
			case 2:
				ui = new SelectOneUI();
				break;
			case 3:
				ui = new AddUI();
				break;
			case 4:
				ui = new UpdateUI();
				break;
			case 5:
				ui = new DeleteUI();
				break;
			case 0:
				ui = new ExitUI();
				break;
			}
			if(ui != null)
				ui.execute();
			else
				System.out.println("잘못입력하셨습니다. 다시선택하세요");
		}
	}
	
	private int menu() {
		System.out.println("----------------------------------");
		System.out.println("\t\t게시판 관리 프로그램 - DB");
		System.out.println("----------------------------------");
		System.out.println("1. 전체게시글 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료 ");
		int type = scanInt("항목을 선택하세요 : ");
		
		return type;
		
	}
}
