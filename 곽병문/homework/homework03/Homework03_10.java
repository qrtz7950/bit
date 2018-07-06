package kr.co.mlec.homework.homework03;

import java.util.Scanner;

/*
 * 5개의 정수를 다음과 같이 입력받아 출력하는 코드를 작성
 * 
 * num1 : 6
 * num2 : 12
 * num3 : 9
 * 	6, 12보다 큰 수여야 합니다
 * num3 : 25
 * num4 : 9
 * 	6, 12, 25보다 큰 수여야 합니다
 * num4 : 22
 *  6, 12, 25보다 큰 수여야 합니다
 * num4 : 40
 * num5 : 77
 * 
 * < PRINT >
 * 6 12 25 40 77
 */

public class Homework03_10 {
	
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		int[] n = new int[5];
		
		for(int i=0; i<n.length; i++) {
			System.out.print("num"+(i+1)+" : ");
			n[i] = s.nextInt();
			
			if(i!=0 && n[i]<n[i-1]) {
				for(int j=i; j>0; j--) {
					if(j!=i) {
						System.out.print(",");
					}
					System.out.print(" "+n[i-j]);
				}
				i--;
				System.out.println("보다 큰수여야 합니다");
			}
		}
		System.out.println("\n< Print >");
		
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i] + " ");
		}
		
		s.close();
	}
}
