package kr.co.mlec.day04.exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 10개의 정수를 입력 받아 다음과 같이 출력
 * num1 : 45
 * num2 : 12
 * num3 : 7
 * num4 : 34
 * num5 : 23
 * num6 : 73
 * num7 : 1
 * num8 : 94
 * num9 : 6
 * num10 : 34
 */
public class ExamMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 10;
		int [] arr = new int[a];
		int [] even = new int[a];
		int [] odd = new int[a];
		
		System.out.println("정수를 넣어");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("num" + i + ": ");
			arr[i]= sc.nextInt();
		}
		
		System.out.println("\n\n<짝수>");
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%2 == 0) {
				System.out.print(arr[i]+ " ");
				even[i] =arr[i];
			}
		}

		System.out.println("\n<홀수>");
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%2 == 1) {
				System.out.print(arr[i] + " ");
				odd[i] =arr[i];
			}
		}
		
		System.out.println("\n\n");
		
		System.out.println("\n\n<짝수>");
		
		for(int i=0; i<arr.length; i++) {
			if (even[i] > 0) {
				System.out.print(even[i] + " ");
			}
		}
		
		System.out.println("\n<홀수>");
		
		for(int i=0; i<arr.length; i++) {
			if (odd[i] > 0) {
				System.out.print(odd[i] + " ");
			}
		}
		
		System.out.println("\n"+Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		
	}

}
