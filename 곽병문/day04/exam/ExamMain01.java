package kr.co.mlec.day04.exam;

import java.util.Scanner;

public class ExamMain01 {
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		
		int[] n = new int[5];
		
		for(int i=0; i<n.length; i++) {
			System.out.print("n" + (i+1) + " = ");
			n[i] = s.nextInt();
		}
		
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		
		s.close();
	}
}
