package kr.co.Homework0706;

import java.util.Arrays;
import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n = 5;
		int i = 0;
		int [] num = new int[n];
		
		while(i<5){
			System.out.printf("num" + (i+1) + ": ");
			num[i] = sc.nextInt();
			if (num[i]%2 !=0) {				
				continue;
			} else {
				i++;
			}
		}
		
		System.out.println(Arrays.toString(num));
	
			
	}

}
