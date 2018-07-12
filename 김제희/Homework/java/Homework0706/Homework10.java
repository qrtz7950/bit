package kr.co.Homework0706;

import java.util.Arrays;
import java.util.Scanner;

public class Homework10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int[] num = new int[5]; 

		while(i<5){
			System.out.printf("num" + (i+1) + ": ");
			num[i] = sc.nextInt();
			
			if (i!=0 && num[i]<num[i-1]) {
				for(int j=i; j>0; j--) {
					System.out.print(num[i-j]+" ");
				}
				System.out.println("보다 큰 수여야 합니다");
			} else {
				i++;
			}
		}
		
		System.out.println(Arrays.toString(num));
		//엔터 두번?
	}

}
