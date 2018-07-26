package board.v1.u4.ui;

import java.util.Scanner;

/**
 * 사용자 화면 처리
 * @author bitacademy
 */
public class BoardUI {
	
	private Scanner sc = new Scanner(System.in);
	
	public void execute() {
		while(true) {
			System.out.println();
			String type = menu();
			switch(type) {
			case "1" :
				SearchUI search = new SearchUI();      // 전체 게시글 조회화면
				search.execute();
				break;
			case "2" :
				SearchOneUI searchOne = new SearchOneUI();  // 게시글 번호로 조회화면
				searchOne.execute();
				break;
			case "3" :
				AddUI add = new AddUI();               // 게시글 등록 화면처리 
				add.execute();
				break;
			case "4" :
				UpdateUI update = new UpdateUI();      // 게시글 수정화면
				update.execute();
				break;
			case "5" :
				DeleteUI delete = new DeleteUI();      // 게시글 삭제화면
				delete.execute();
				break;
			case "0" :
				ExitUI exit = new ExitUI();        // 게시판 프로그램 종료화면
				exit.execute();
			}    // end of switch block
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
	
	String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
}















