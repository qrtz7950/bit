package board.v1.u5.ui;

public class UpdateUI extends BaseUI {
	public void execute() {
		int no = scanInt("수정할 글번호를 입력하세요 : ");
		String title  = scanStr("변경할 제목을 입력하세요 : ");
		System.out.println("글 수정 메뉴 선택함\n");
	}
}
