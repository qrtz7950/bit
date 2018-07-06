package kr.co.mlec.day04.exam;

import java.util.Scanner;

public class ExamMain02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] n = new int[10];
		String[] str = {"< Â¦¼ö >", "< È¦¼ö >"};
		
		for(int i=0; i<n.length; i++) {
			System.out.print("num" + (i+1) + " = ");
			n[i] = s.nextInt();
		}
		
		System.out.println();
		
		for(int j=0; j<2; j++) {
			System.out.println(str[j]);
			for(int i=0; i<n.length; i++) {
				if(n[i] % 2 == j) {
					System.out.print(n[i] + " ");
				}
			}
			System.out.println();
		}
		
		s.close();

	}

}
