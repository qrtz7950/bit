package kr.co.mlec.homework.homework01;

import java.util.Scanner;

public class Homework01_08 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("물건값을 입력 : ");
		int howmuch = s.nextInt();
		System.out.print("지불한 돈의 액수 : ");
		int money = s.nextInt();
		
		int back = money - howmuch;
		
		System.out.println("\n거스름 돈 : " + back + "원");
		System.out.printf("1000원 : %d개\n", back/1000);
		back %= 1000;
		System.out.printf(" 500원 : %d개\n", back/500);
		back %= 500;
		System.out.printf(" 100원 : %d개\n", back/100);
		back %= 100;
		System.out.printf("  50원 : %d개\n", back/50);
		back %= 50;
		System.out.printf("  10원 : %d개\n", back/10);
		
		s.close();
	}

}
