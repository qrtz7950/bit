package kr.co.Homework0706;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("2와 9사이의 정수 입력: ");
		int num = sc.nextInt();
		System.out.println(num + "의 배수를 제외한 정수 출력 ");
		
		for(int i =0; i<100; i++) {
			if(i % num != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		int a = 0;
		for(int i =0; i<100; i++) {
			if(i % num != 0) {
				System.out.print(i + " ");
				a++;
			}
			if(a==5) {
				System.out.println();
				a=0;
			}
		}
		
		
	}

}
