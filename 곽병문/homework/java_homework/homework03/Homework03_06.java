package kr.co.mlec.homework.homework03;

import java.util.Scanner;

/*
 * 시작단, 종료단을 입력받아 구구단을 출력
 * 시작단 : 6 8
 * 종교단 : 8 6
 */

/*
 * 2-9사이 구구단 출력(한라인에 3단씩 출력)
 * *** 2단 ***	*** 3단 ***	*** 4단 ***
 * ...
 * *** 8단 ***	*** 9단 ***
 * ...
 * for(int i=2; i <=9; i++){}로 전체 루프
 * 반복문 최대 3개만 사용
 */

public class Homework03_06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i1, i2;
		
		System.out.print("시작단 : ");
		i1 = s.nextInt();
		System.out.print("종료단 : ");
		i2 = s.nextInt();
		
		System.out.println();
		
		for(int i = (i1<i2 ? i1 : i2); i<=(i1>i2 ? i1 : i2); i++) {
			System.out.println("*** " + i + "단 ***");
			for(int j = 1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------");
		
		
		for(int i=2; i<=9; i+=3) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<3; k++) {
					if(i+k<10) {
						if(j==0) {
							System.out.print("*** " + (i+k) + "단 ***\t");
						}
						else {
							System.out.print((i+k) + " * " + j + " = " + (i+k)*j + "\t");
						}
					}
				}
				System.out.println();
				
			}
		}
		
		s.close();
	}

}
