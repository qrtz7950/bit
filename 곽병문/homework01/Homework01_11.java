package kr.co.mlec.homework01;

import java.util.Scanner;

public class Homework01_11 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 4개 입력 : ");
		String stra = s.next();
		int a = Integer.parseInt(stra);
		String strb = s.next();
		int b = Integer.parseInt(strb);
		String strc = s.next();
		int c = Integer.parseInt(strc);
		String strd = s.next();
		int d = Integer.parseInt(strd);
		
		
		
		if(a>b && a>c && a>d) {
			System.out.printf("가장 큰수 : %d", a);
		}
		if(b>a && b>c && b>d) {
			System.out.printf("가장 큰수 : %d", b);
		}
		if(c>a && c>b && c>d) {
			System.out.printf("가장 큰수 : %d", c);
		}
		if(d>a && d>b && d>c) {
			System.out.printf("가장 큰수 : %d", d);
		}
		
		s.close();
	}

}
