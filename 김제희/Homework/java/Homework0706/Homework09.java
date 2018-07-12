package kr.co.Homework0706;

import java.util.Arrays;
import java.util.Random;

public class Homework09 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = 5;
		int [] num = new int[n];
		int [] num2 = new int[n];
		int [] num3 = new int[n];
		int [] num4 = new int[n];
		
		for(int i=0;i<n;i++) {
			num[i] = r.nextInt(100);
		}
		
		for(int i=0;i<n;i++) {
			if(num[i]>=10) {
				num2[i]= num[i]%10;
				num3[i]= num[i]/10;
				num4[i]= 10*num2[i] + num3[i];
			} else {
				num4[i]= num[i];
			}
		}
		
		System.out.println("<PRINT>");
		System.out.println(Arrays.toString(num));
		
		System.out.println("<REVERSE>");
		System.out.println(Arrays.toString(num4));
		
	}

}
