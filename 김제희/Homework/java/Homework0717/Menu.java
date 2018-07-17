package kr.co.Homework0717;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	
	void start() {
		
		System.out.println("게시판 관리프로그램");
		System.out.println("  ***메뉴***");
		System.out.println("1. 전체 게시글 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료");
		System.out.print("원하는 항목을 선택하세요: ");
		int selMenu = sc.nextInt();
		sc.nextLine();
		
		new Manage().manage(selMenu);
		
	}
	
}
