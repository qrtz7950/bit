package kr.co.mlec.day06;

import java.util.Scanner;

public class Gugudan {
	
	/*
	 * 키보드로 단을 입력받아 호출자 메소드에 전달하는 기능
	 * @retuen 입력단
	 */
	
	int getDan() {
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		sc.nextLine();
		
		return dan;
		
	}
	
	int getDan(String msg) {
		
		System.out.print(msg);
		
//		int dan = sc.nextInt();
//		return dan;
		
		return getDan();
		
	}
	
	/*
	 * 호출자 메소드가 넘겨준 단을 출력하는 기능 제공
	 * @param dan
	 */
	void print(int dan) {
		
		System.out.println();
		for(int i =0; i<9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	
	void print() {
		
		print(2,9);
		
		/*
		for(int dan = 2; dan <= 9; dan++) {
			print(dan);
		}
		*/
		
		/*
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		}
		*/
		
	}

	void print(int start, int end) {
		
		for(int dan = start; dan<=end; dan++) {
			print(dan);
		}
		
		
	}

}	
	
