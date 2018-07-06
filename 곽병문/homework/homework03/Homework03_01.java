package kr.co.mlec.homework.homework03;

/*
 *  1~100사이의 홀수 출력
 *  1 3 5 7... 97 99
 */

public class Homework03_01 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}

	}

}
