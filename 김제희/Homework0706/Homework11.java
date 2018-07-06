package kr.co.Homework0706;

import java.util.Scanner;

public class Homework11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] g = new int[5];
		int[] abcdf = new int[5];
		int e = 0;
		double sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1 + "'s 성적: ");
			g[i] = sc.nextInt();
		}
		
		System.out.println("\n번호   성적   학점");
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1 + "  ");
			if(g[i]>=0 && g[i]<=100) {
				System.out.print(g[i]+"  ");
				sum += g[i];
				if(g[i]>=90 && g[i]<=100) {
					System.out.print("A\n");
				} else if(g[i]>=80 && g[i]<=89) {
					System.out.print("B\n");
				} else if(g[i]>=70 && g[i]<=79) {
					System.out.print("C\n");
				} else if(g[i]>=60 && g[i]<=69) {
					System.out.print("D\n");
				} else {
					System.out.print("F\n");
				}
			} else {
				System.out.print("ERROR!!\n");
				e++;
			}
		}
		
		System.out.printf("5회 입력 중 [%d]회 에러발생\n", e);
		System.out.printf("총점: %.0f \n", sum);
		System.out.printf("평균: %.2f \n", sum/5);
		
			
			
	}
}
