package day02;

import java.util.Scanner;

/*
 * 숫자 2개를 입력받아 두번째 정수가 첫번쨰 정수의 약수여부 판단
 * 첫번째 정수 :12
 * 두번째 정수 :3
 * 
 * 3은 12의 약수 여부 TRUE/FALSE
 * 
 */
public class OperationMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수(큰 수): ");
		int num = sc.nextInt();
		System.out.print("두번째 정수(작은 수): ");
		int num2 = sc.nextInt();
		
		//boolean bool2 = num % num2 == 0;
		boolean bool = (num2!=0) && (num % num2 == 0);
		System.out.println(num2+ "는(은)" + num +"의 약수 인가?: "+bool);
	}

}
