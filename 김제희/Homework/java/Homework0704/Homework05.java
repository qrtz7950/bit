package kr.co.Homework0704;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		
		double ex = 1092.50;
		System.out.printf("현재 1달러 = %.2f원\n", ex);
		System.out.printf("환전하고싶은 달러를 입력하세요: ", ex);
		
		Scanner sc = new Scanner(System.in);
		int dollar = sc.nextInt();
		
		System.out.printf("환전하기위해서는 %.2f원이 필요합니다", ex * dollar);
		
		
	}
}
