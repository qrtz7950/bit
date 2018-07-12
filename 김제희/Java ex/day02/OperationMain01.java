package kr.co.mlec.day02;

import java.util.Scanner;

/*
 * 숫자 2개를 입력받아 두번째 정수가 첫번째 정수의 약수 여부 판단
 * 첫번째 정수: 12
 * 두번째 정수: 3
 * 
 * 3은 12의 약수여부 : true/false
 * 
 */
public class OperationMain01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num = sc.nextInt();
		System.out.printf("첫번째 정수: %d\n", num);
		
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		System.out.printf("첫번째 정수: %d\n", num2);
		
		//boolean bool = num % num2 == 0; //논리연산에 의해 값이 투르/펄스로 나오므로 자료형을 불린으로
		boolean bool = (num2 != 0 && num2 % num2 == 0);
		
		System.out.print(num2 + "는" + num + "의 약수여부 판단:" + bool);
	}
}
