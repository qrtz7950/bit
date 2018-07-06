package kr.co.mlec.homework.homework03;

import java.util.Random;

public class Homework03_09 {
	
	public static void main(String[] arg) {
		
		Random r = new Random();
		int[] n = new int[5];
		int n10;	//10의 자리
		int n1;		//1의 자리
		
		System.out.println("< PRINT >");
		for(int i=0; i<n.length; i++) {
			n[i] = r.nextInt(100);
			System.out.print(n[i] + " ");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i=n.length; i>0 ; i--) {
			n10 = n[i-1]/10;
			n1 = n[i-1]%10;
			n[i-1] = n1*10 + n10;
			System.out.print(n[i-1] + " ");			
		}
		
		
	}
}
