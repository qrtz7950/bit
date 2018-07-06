package kr.co.mlec.day04;

import java.util.Scanner;

/*
 * 2-10사이의 정수를 입력하면 숫자만큼 hello를 출력
 * 
 * 2-10 정수를 제외시 1번의 hello를 출력
 * 
 * 단 숫자는 양수로 한정한다
 */
public class LoopMain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력: ");
		
		int num = sc.nextInt();

/*
		if(num <=10) {
				for(int i=1; i<=num; i++) {
					System.out.println("hello");
				}
		} else 
			System.out.println("hello");
		}
*/
		
/*		
		for(int i=1; i<=num; i++) {
			System.out.println("hello");
			
			if(num > 10) {
				break;
			}
*/
		
		for(int i=1; i<=num; i++) {
			if(i % 2 == 0) {
				System.out.println();
			}
			
			System.out.print("hello");
		}
		
	}

}
