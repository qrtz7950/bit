package kr.co.Homework0704;

import java.util.Scanner;

public class Homework11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수: ");
		int b = sc.nextInt();
		System.out.print("세번째 정수: ");
		int c = sc.nextInt();
		System.out.print("네번째 정수: ");
		int d = sc.nextInt();

		if(a>b && a>c && a>d) {
			System.out.printf("가장 큰 수 : %d" , a);
		}
		if(b>a && b>c && b>d) {
			System.out.printf("가장 큰 수 : %d" , b);
		}
		if(c>a && c>b && c>d) {
			System.out.printf("가장 큰 수 : %d" , c);
		}
		if(d>a && d>b && d>c) {
			System.out.printf("가장 큰 수 : %d" , d);
		}
	}
		
}
