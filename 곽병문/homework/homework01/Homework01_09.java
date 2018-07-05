package kr.co.mlec.homework.homework01;

import java.util.Scanner;

/*
 * 기상한다;
 * if(조건식){
 * 		밥먹고;
 * }
 * 학교간다;
 */

public class Homework01_09 {
	
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("보유하고 있는 책권수 : ");
		int bn = s.nextInt();
		
		if(bn < 0) {
			System.out.println("잘못입력했습니다");
		}
		else if(bn == 0) {
			System.out.println("보유하고 있는 책 없음");
		}
		else if(bn == 1){
			System.out.println("1 book");
		}
		else {
			System.out.println(bn + " books");
		}
		
		s.close();
	}
	
}
