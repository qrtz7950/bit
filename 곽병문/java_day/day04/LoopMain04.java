package kr.co.mlec.day04;

import java.util.Scanner;

/*
 * 2-10사이의 정수를 입력하면 숫자만큼 "Hello" 출력
 * 단, 범위 밖이면 한번만 출력
 */

public class LoopMain04 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("반복할 횟수? : ");
		int n = s.nextInt();
		if(n>0) {
					for(int i=0; i<n; i++) {
						System.out.println("Hello");
						if(n>=10) {break;}
					}
		}else {
			System.out.println("???");
		}
		
		s.close();
	}
}
