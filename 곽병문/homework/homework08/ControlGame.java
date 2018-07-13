package kr.co.mlec.homework.homework08;

import java.util.Scanner;

public class ControlGame {

	Scanner s = new Scanner(System.in);
	/**
	 * 게임 선택 메뉴
	 * @return char sellect
	 */
	public char menu() {

		char sel;
		
		System.out.println("게임을 선택하세요");
		System.out.println(" A. 가위바위보");
		System.out.println(" B. 주사위 값 맞추기");
		System.out.println(" C. 종료");
		
		while(true) {
			sel = s.nextLine().charAt(0);
			if(sel>='A' && sel<='C') {
				break;
			}
			System.out.println("다시 입력하세요");
		}
		
		return sel;
	}
	
	/**
	 * 가위바위보 선택
	 * @return
	 */
	public int srpsel() {
		
		int srp;
		
		System.out.println("가위바위보 게임입니다.");
		System.out.println("가위바위보중 하나를 선택하세요.");
		System.out.println("(1:가위, 2:바위, 3:보)");
		
		while(true) {
			srp = Integer.parseInt(s.nextLine());
			if(srp>=1 && srp<=3) {
				break;
			}
			System.out.println("다시 입력하세요");
		}
		
		return srp;
	}
	
	/**
	 * 주사위 숫자 입력
	 * @return
	 */
	public int dsel() {
		
		int d;
		
		System.out.println("주사위 값 맞추기 게임입니다.");
		System.out.println("주사위 수를 선택하세요(1~6값 중 하나)");
		
		while(true) {
			d = Integer.parseInt(s.nextLine());
			if(d>=1 && d<=6) {
				break;
			}
			System.out.println("다시 입력하세요");
		}
		
		return d;
	}
}
