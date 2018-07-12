package kr.co.mlec.day03;

import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("좋아하는 계절을 입력 : ");
		
		String input = s.nextLine();
		String str;
		
		switch(input) {
			case "SPRING":
			case "spring":
			case "봄":
					str = "황사";
					break;
			case "SUMMER":
			case "summer":
			case "여름":
					str = "더워";
					break;
			case "FALL":
			case "fall":
			case "가을":
					str = "낙엽";
					break;
			case "WINTER":
			case "winter":
			case "겨울":
					str = "추워";
					break;
			default: str = "뭐라고?";
		}
		System.out.println(str);
		
		s.close();
	}

}
