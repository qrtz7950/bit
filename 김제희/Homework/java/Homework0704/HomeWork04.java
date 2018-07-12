package kr.co.Homework0704;

import java.util.Scanner;

public class HomeWork04 {
	public static void main(String[] args) {
		
		System.out.print("계산을 위한 정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("나눌 수를 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.printf("몫: %d\n", num/num2);
		System.out.printf("나머지: %d", num%num2);
	}

}
