package kr.co.mlec.homework.homework01;

import java.util.Scanner;

public class Homework01_04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = s.nextInt();
		System.out.print("나눌 수를 입력하세요 : ");
		int b = s.nextInt();
		
		System.out.printf("몫 : %d\n", a/b);
		System.out.printf("나머지 : %d", a%b);
		
		s.close();
	}

}
