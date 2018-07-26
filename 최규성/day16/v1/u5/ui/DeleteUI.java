package board.v1.u5.ui;

public class DeleteUI extends BaseUI {
	public void execute() {
		int no = scanInt("삭제할 글번호를 입력하세요 : ");
		System.out.println("글삭제 메뉴 선택함\n");
	}
}
