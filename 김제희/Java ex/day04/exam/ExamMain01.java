package kr.co.mlec.day04.exam;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5개의 정수를 입력 받아 출력하는 코드를 작성해보자
 * num1 : 12
 * num2 : 6
 * num3 : 33
 * num4 : 82
 * num5 : 5
 * 
 */

public class ExamMain01 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("5개의 정수를 차례대로 입력하시오");
		
		int [] nArr = new int[5];
		
		for(int i=0; i<nArr.length; i++) {
			System.out.print("num" + i + ": ");
			nArr[i] = sc.nextInt(); 
		}
		
		for(int i=0; i<nArr.length; i++) {
			System.out.println("num" + i + ": " + nArr[i]);
		}

	}

}
