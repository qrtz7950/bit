package kr.co.mlec.day02;

import java.util.Scanner;

/*
 * 기상한다;
 * if(조건식){
 * 		밥먹고;
 * }
 * 학교간다;
 */

public class IfMain01 {
	
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("책 몇권 가짐? : ");
		int bn = s.nextInt();
		
		if(bn == 0) {
			System.out.println("no book");
		}
		else if(bn == 1){
			System.out.print(bn + " book");
		}
		else {
			System.out.println(bn + " books");
		}
		System.out.println();
		s.close();
	}
	
}
