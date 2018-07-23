package kr.co.mlec.homework.homework03;

/*
 * 100~1 사이의 짝수 출력
 * 100 98 96 ... 4 2
 */

public class Homework03_02 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}

}
