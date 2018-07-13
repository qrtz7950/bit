package kr.co.day50;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		Game g = null;
		
		boolean bool = true;
		int total = 0;
		
		while(bool) {
		System.out.println("게임을 선택하세요");
		System.out.println("A.가위바위보");
		System.out.println("B.주사위 값 맞추기");
		System.out.println("C.종료");
		
		char sel = sc.nextLine().charAt(0);
		
		switch (sel) {
		case 'A' :
			g = new ScissorsRockPaper();
			System.out.println("가위바위바위보 게임입니다.");
			System.out.println("가위바위보중 하나를 선택하세요");
			System.out.println("1:가위,2:바위,3:보");
			int you = sc.nextInt();
			sc.nextLine();
			total += g.startGame(you); 
			break;
			
		case 'B' :
			g = new Dice();
			System.out.println("주사위 값 맞추기 게임입니다.");
			System.out.println("주사위을 선택하세요(1~6값 중 하나)");
			you = sc.nextInt();
			sc.nextLine();
			total += g.startGame(you); 
			break;
		
		case 'C' :
			System.out.println("게임을 종료합니다");
			System.out.printf("당신의 total score는 %d입니다\n",total);
			bool = false;
			break;
			
		default :
			System.out.println("다시 입력하세요");
			break;
		}
		}
		
	}

}
