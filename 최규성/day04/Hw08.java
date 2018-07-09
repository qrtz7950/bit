package day04Hw;

import java.util.Scanner;

public class Hw08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("짝수를 입력하세요");
		int[] num = new int[5];
		for (int i = 0; i <= 4; i++) {
			System.out.print("num" + (i+1) + ": ");
			int a = sc.nextInt();
			if (a % 2 != 0) {
				i--;
			} else {
				for (int j = 0; j < 5; j++) {
					num[i] = a;
				}
			}
		}
		System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]);
	}
}
