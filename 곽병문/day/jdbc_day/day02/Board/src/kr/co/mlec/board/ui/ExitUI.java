package kr.co.mlec.board.ui;

public class ExitUI implements IBoardUI {

	@Override
	public void execute() throws Exception {
			
		System.out.println("=======================================");
		System.out.println("\n\t게시판 프로그램을 종료합니다\n");
		System.out.println("=======================================");
		System.exit(0);

	}

	
}
