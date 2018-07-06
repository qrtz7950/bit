package kr.co.mlec.homework.homework03;

/*
 * 구구단 출력
 * *** 2단 ***
 * 2 * 1 = 2
 * ...
 * *** 9단 ***
 * 9 * 1 = 9
 * ...
 */

public class Homework03_05 {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.println("*** " + i + "단 ***");
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}

	}

}
