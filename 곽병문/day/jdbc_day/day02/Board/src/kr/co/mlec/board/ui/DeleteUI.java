package kr.co.mlec.board.ui;

public class DeleteUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("삭제할 글번호를 입력하세요 : ");
		service.deleteBoard(no);
		
		System.out.println("게시글번호 [" + no + "]번 게시글을 삭제하였습니다");
	}

	
}
