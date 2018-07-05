package kr.co.Homework0704;

import java.util.Scanner;

public class Homework09 {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		System.out.print("보유하고있는 책 권수 입력: ");
		int book = sr.nextInt();
		
		if(book < 0) {
			System.out.print("잘못입력했습니다");
		} else if(book == 0) {
			System.out.print("보유하고있는 책 없음");			
		} else if(book == 1) {
			System.out.print(book + " book");			
		} else if(book > 1) {
			System.out.print(book + " books");			
		}
	}
}
