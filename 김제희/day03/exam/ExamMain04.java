package kr.co.mlec.day03.exam;

public class ExamMain04 {

	public static void main(String[] args) {
/*
		for(int i = 1; i <= 5; i++) {
			for(int k = 1; k <= i-1; k++) {
				System.out.print(" ");					
			}
			for(int j = 1; j <= 6-i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
*/	
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j<i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		//여기부터다른코드
/*		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; i+j <= 5; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
*/	
	}
	
}
