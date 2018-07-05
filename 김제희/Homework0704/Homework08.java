package kr.co.Homework0704;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		System.out.print("물건값을 입력: ");
		Scanner sc = new Scanner(System.in);
		int pri = sc.nextInt();
		System.out.print("지불한 돈의 액수: ");
		int mon = sc.nextInt();
		
		int ex = mon-pri;
		
		System.out.printf("\n거스름돈: %d원\n", ex);
		System.out.printf("1000원 : %d개\n", ex/1000);
		System.out.printf(" 100원 : %d개\n", (ex%1000)/100);
		System.out.printf("  50원 : %d개\n", (ex%100)/50);
		System.out.printf("  10원 : %d개\n", (ex%50)/10);
	}
}
