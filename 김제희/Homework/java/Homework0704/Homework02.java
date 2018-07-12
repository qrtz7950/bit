package kr.co.Homework0704;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		//3661초
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변환한 초를 입력하세요: ");
		int sec = sc.nextInt();
		System.out.printf("입력한 시간  %d초는 다음과 같이 변환됩니다"+ ": ", sec);
		System.out.print((sec - sec % 3600)/3600 + "시간 ");
		System.out.print((sec%3600)/60  + "분 ");
		System.out.print(sec%60 + "초");
		
	}

}
