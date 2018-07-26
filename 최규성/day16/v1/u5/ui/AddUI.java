package board.v1.u5.ui;

public class AddUI extends BaseUI {
	public void execute() {
		String title  = scanStr("제목을 입력하세요 : ");
		String writer = scanStr("글쓴이를 입력하세요 : ");
		System.out.println("글 등록 메뉴 선택함\n");
	}
}
