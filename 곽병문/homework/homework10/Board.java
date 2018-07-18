package kr.co.mlec.homework.homework10;

public class Board extends BoardServer{
	public static int totalnum = 0;
	
	public void start() {
		
		while(true) {
			int a = menu();
			switch(a) {
				case 1:
					showAll();
					break;
				case 2:
					showNum();
					break;
				case 3:
					upload();
					break;
				case 4:
					modify();
					break;
				case 5:
					remov();
					break;
				case 0:
					System.exit(0);
				default :
					System.out.println("잘못된 선택입니다.");
			}
			System.out.println();
			
		}
	}
	
	public int menu() {
		System.out.println("*** 메뉴 ***");
		System.out.println("1. 전체게시글 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료");
		System.out.print("원하는 항목을 선택하세요 => ");
		int a = Integer.parseInt(s.nextLine());
		return a;
	}
}
