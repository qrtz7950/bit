package kr.co.Homework0706;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작단: ");
		int a = sc.nextInt();
		System.out.print("종료단: ");
		int b = sc.nextInt();
		int c = 0;
		
		if(a>b) {
			c=a; a=b; b=c;
		}

		for (int i = a; i <= b; i++) {
			System.out.println("****" + i + "단" + "****");
			for (int j = 2; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		
	}

}
