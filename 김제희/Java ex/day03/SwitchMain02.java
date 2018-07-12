package kr.co.mlec.day03;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 계절을 입력");
		String season = sc.nextLine();
		
		switch(season) {
		case "SPRING" :
		case "spring" : //스위치 조건문을 시작을 정해주는 것이기 때문에 이런식으로 조건을 설정해도됨
		case "봄" :
			System.out.println(season + "은 3월 - 5월까지입니다");
			break;
		case "SUMMER" :
		case "summer" :
			System.out.println(season + "은 6월 - 8월까지입니다");
			break;
		case "FALL" :
		case "fall" :
			System.out.println(season + "은 9월 - 11월까지입니다");
			break;
		case "WINTER" :
		case "winter" :
			System.out.println(season + "은 12월 - 2월까지입니다");
			break;
		default :
			System.out.println("얌마 계절치라고 임마");
		}
	}

}
