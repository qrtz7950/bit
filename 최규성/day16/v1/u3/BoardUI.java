package board.v1.u3;

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
				searchUI();      // 전체 게시글 조회
				break;
			case "2" :
				searchOneUI();  // 게시글 번호로 조회
				break;
			case "3" :
				addUI();      // 게시글 등록
				break;
			case "4" :
				updateUI();      // 게시글 수정
				break;
			case "5" :
				deleteUI();      // 게시글 삭제
				break;
			case "0" :
				exitUI();        // 게시판 프로그램 종료
			}    // end of switch block
		}	// end of while loop
	}  // end of process method
	
	String menu() {
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
	
	/**
	 * 전체 게시글을 조회하는 기능 
	 */
	void searchUI() {
		System.out.println("전체 게시글 조회 메뉴 선택함");
	}
	
	/**
	 * 게시글 번호에 해당하는 글을 조회하는 기능
	 */
	void searchOneUI() {
		int no = scanInt("조회할 글번호를 입력하세요 : ");
		scanStr("글번호 조회메뉴 선택함");
	}
	
	/**
	 * 게시글을 등록하는 기능
	 */
	void addUI() {
		String title  = scanStr("제목을 입력하세요 : ");
		String writer = scanStr("글쓴이를 입력하세요 : ");
		System.out.println("글 등록 메뉴 선택함\n");
	}
	
	/**
	 * 게시글 수정 기능
	 */
	void updateUI() {
		int no = scanInt("수정할 글번호를 입력하세요 : ");
		String title  = scanStr("변경할 제목을 입력하세요 : ");
		System.out.println("글 수정 메뉴 선택함\n");
	}
	
	/**
	 * 게시글 삭제 기능
	 */
	void deleteUI() {
		int no = scanInt("삭제할 글번호를 입력하세요 : ");
		System.out.println("글삭제 메뉴 선택함\n");
	}
	
	/**
	 * 게시판 프로그램 종료처리
	 */
	void exitUI() {
		System.out.println("게시판 프로그램을 종료합니다.\n");
		System.exit(0);
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















