package day04Hw;

import java.util.Scanner;

public class Hw03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		
		System.out.print("2~9사이의 정수입력: ");
		int a = sc.nextInt();
		System.out.println(a+"의 배수를 제외한 정수출력");
		for (int i = 1; i <= 100; i++) {
			
			if (i % a != 0) {
				System.out.print(i+" ");
				cnt++;
				if(cnt % a ==0) {
					System.out.println();
				}
			} else if(i == a+1) {
				System.out.println();
			}

		}
		
	}
}
