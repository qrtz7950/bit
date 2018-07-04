package kr.co.mlec.day02;

import java.util.Scanner;

/*
 *  숫자 2개를 입력받아 두번째 정수가 첫번째 정수의 약수여부 판단
 *  첫번째 정수 : 12
 *  두번째 정수 : 3
 */

public class OperationMain01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = s.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = s.nextInt();
		
		boolean bool = (num2 != 0) && (num1 % num2 == 0);
		
		if(bool) {
			System.out.println("약수 o");
		}
		else {
			System.out.println("약수 x");
		}
		
		s.close();

	}

}
