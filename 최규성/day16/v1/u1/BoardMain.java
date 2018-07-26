package board.v1.u1;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		outer: while (true) {
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println("1. 전체게시물 조회   ");
			System.out.println("2. 글번호 조회   ");
			System.out.println("3. 글등록   ");
			System.out.println("4. 글수정   ");
			System.out.println("5. 글삭제   ");
			System.out.println("0. 종료 ");
			System.out.println("--------------------------------------------------");
			System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
			String type = sc.nextLine();

			int no = 0;
			String title = "";
			String writer = "";

			switch (type) {
			case "1":
				System.out.println("전체 게시글 조회 메뉴 선택함");
				break;
			case "2":
				System.out.print("조회할 글번호를 입력하세요 : ");
				no = sc.nextInt();
				sc.nextLine();
				System.out.println("글번호 조회메뉴 선택함");
				break;
			case "3":
				System.out.print("제목을 입력하세요 : ");
				title = sc.nextLine();
				System.out.print("글쓴이를 입력하세요 : ");
				writer = sc.nextLine();
				System.out.println("글 등록 메뉴 선택함\n");
				break;
			case "4":
				System.out.print("수정할 글번호를 입력하세요 : ");
				no = sc.nextInt();
				sc.nextLine();
				System.out.print("변경할 제목을 입력하세요 : ");
				title = sc.nextLine();
				System.out.println("글 수정 메뉴 선택함\n");
				break;
			case "5":
				System.out.print("삭제할 글번호를 입력하세요 : ");
				no = sc.nextInt();
				sc.nextLine();
				System.out.println("글삭제 메뉴 선택함\n");
				break;
			case "0":
				System.out.println("게시판 프로그램을 종료합니다.\n");
				break outer;
			default :
				System.out.println("메뉴를 확인하세요!!");
			}
		}
		sc.close();
	}
}