package board.v1.u5.ui;

public class SearchOneUI extends BaseUI  {
	public void execute() {
		int no = scanInt("조회할 글번호를 입력하세요 : ");
		System.out.println("글번호 조회메뉴 선택함");
	}
}
