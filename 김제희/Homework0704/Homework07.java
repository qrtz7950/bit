package kr.co.Homework0704;

import java.util.Scanner;

public class Homework07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력(알파벳): ");
		String inputStr= sc.nextLine();
		
		//65=<대문자=<90 97=<소문자=<122
		
		System.out.print("변경된 값: ");
		
		char c = inputStr.charAt(0);
		if(c>=65 && c<=90) {
			System.out.println((char)(c+32));
		} else if(c>=97 && c<=122) {
			System.out.println((char)(c-32));
		}
	}
}