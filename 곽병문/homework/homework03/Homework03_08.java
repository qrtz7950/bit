package kr.co.mlec.homework.homework03;

import java.util.Scanner;

/*
 * 다음의 결과를 보이는 프로그램 작성
 * 
 * num1 : 12
 * num2 : 9
 * num2 : 15
 * num2 : 6
 * num3 : 94
 * num4 : 6
 * num5 : 11
 * num5 : 12
 * 
 * <PRINT>
 * 12 6 94 6 12
 * 
 * 짝수일때만 입력 받음
 */

public class Homework03_08 {
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++) {
			System.out.print("num" + (i+1) + " : ");
			num[i] = s.nextInt();
			if(num[i]%2!=0) {i--;}
		}
		System.out.println();
		
		System.out.println("<PRINT>");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		s.close();		
	}
}
