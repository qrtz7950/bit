package day06;

import java.util.Scanner;

public class Gugudan {
	/*
	 * 키보드로 단을 입력받아 호출자 메소드에 전달하는 기능
	 * 
	 * @return 입력단
	 */
	int getDan(String msg) {

		System.out.print(msg);

		return getDan(); // getDan의 리턴값 dan을 main에 반환

		// Scanner sc = new Scanner(System.in); //위의 getDan메소드와 겹치는 부분이 많기 때문에 위의 메소드를
		// 호출하기로함
		// int dan = sc.nextInt();
		// sc.nextLine();
		//
		//
		// return dan;
	}

	void print(int dan) { // 호출자 메소드가 넘겨준 1개의 단을 출력하는 기능 제공
		System.out.println("*** " + dan + "단 ***");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		System.out.println();
	}

	void print() { // 모든 구구단을 호출하는 메소드 void형
		
		print(2,9); 	//맨밑의 범위 단 출력메소드 호출해서 2-9단 전부 출력
		
		/*for (int dan = 2; dan <= 9; dan++) { // 위의 print(int dan)의 구구단 작성 코드를 호출
			print(dan); // 호출 후 반복문으로 모든 구구단 출력
		}*/
		
		
		// for(int dan = 2; dan <= 9 ; dan++) {
		// System.out.println("*** "+ dan+ "단 ***");
		// for(int i = 1 ; i <= 9; i++) {
		// System.out.printf("%d * %d = %d\n", dan, i , dan *i);
		// }
		// }
	}
	/////////////////////////////////////////////////////////////

	int getDan() {

		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.nextLine(); // 버퍼 비워주기

		return dan; // getDan(String msg)에 dan을 반환
	}

	///////////////////////////////////////////////////////////
	void print(int startDan, int endDan) { // 범위단 출력 메소드

		for (int dan = startDan; dan <= endDan; dan++) {
			print(dan); // for문 2개를 사용한 구구단출력 메소드 호출

		}
	}

}
