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
		
		//		int max = num2;
//		if(num>num2) {
//			max = num;
//		}
//		이런 방법도 가능하고
		
//		int max = num > num2 ? num : num2;
//		if(num3 > max) {
//			max = num3;
//		}
//		도 가능하고
//		if문 없이 조건 연산자만을 이용한 토너먼트도 가능하다
//		int max1 = num > num2 ? num : num2;
//		int max2 = num3 > num4 ? num3 : num4;
//		System.out.println(max1 > max2 ? max1 : max2);
//		}
	}
		
}
