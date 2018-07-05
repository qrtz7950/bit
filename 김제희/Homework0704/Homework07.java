package kr.co.Homework0704;

import java.util.Scanner;

public class Homework07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력(알파벳): ");
		String inputStr= sc.nextLine();
		
		//65=<대문자=<90 97=<소문자=<122
		//65 90 외울 필요없이 'A' 문자를 형변한해서 65,90을 도출할 수 있다
		//if(C>='A' && c<='Z')
		//아스키코드의 대문자 소문자 차이 32도 'a'-'A'로 도출할 수 있다
		
		System.out.print("변경된 값: ");
		
		char c = inputStr.charAt(0);
// 		변수에서 형변환 미리해서 int c 로 받아버리면 출력문에서 형변환을 안해도된다
		if(c>=65 && c<=90) {
			//프린트 문도 if문 바깥에 넣고 조건문안에서는 변수만 수정하면 좀더 깔끔
			System.out.println((char)(c+32));
		} else if(c>=97 && c<=122) {
			System.out.println((char)(c-32));
		}
	}
}
