package day03;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 계절을 입력: ");
		String season = sc.nextLine();
		
		switch(season) {
		 case "SPRING" :
		 case "spring" :
		 case "봄" :
			 System.out.println(season + "은 3월 ~ 5월 입니다.");
			 break;
		 case "SUMMER" :
		 case "summer" :
			 System.out.println(season + "은 6월 ~ 8월 입니다.");
			 break;
		 case "FALL" :
		 case "fall" :
			 System.out.println(season + "은 9월 ~ 11월 입니다.");
			 break;
		 case "WINTER" :
		 case "winter" :
			 System.out.println(season + "은 12월 ~ 2월 입니다.");
			 break;
		}
	
	
	}

}
