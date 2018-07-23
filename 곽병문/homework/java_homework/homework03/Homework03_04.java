package kr.co.mlec.homework.homework03;

import java.util.Scanner;

/*
 * 단을 입력받아 해당 구구단을 출력
 * 2~9사이 수 입력 : 6
 * *** 6단 ***
 * 6 * 1 = 6
 * ...
 * 6 * 9 = 54
 */

public class Homework03_04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("2 ~ 9 사이의 수 입력 : ");
		n = s.nextInt();
		
		System.out.println("*** " + n + "단 ***");
		for(int i=1; i<=9; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		
		s.close();
	}

}
