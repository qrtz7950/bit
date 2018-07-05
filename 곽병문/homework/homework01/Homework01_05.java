package kr.co.mlec.homework.homework01;

import java.util.Scanner;

public class Homework01_05 {

	public static void main(String[] args) {
		
		System.out.print("달러를 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		
		int dol = s.nextInt();
		
		System.out.printf("원화 : %.2f원", dol*1092.50);
		
		s.close();
	}

}
