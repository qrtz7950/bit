package kr.co.mlec.day03.exam;

public class ExamMain06 {

	public static void main(String[] args) {
/*
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 5-i; j++) {
					System.out.print("-");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print('*');
				}
			} else {
				for (int k = 1; k <= i-5; k++) {
					System.out.print("-");
				}
				for (int j = 1; j <= 10-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
*/
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 5; j++) {
					if(j <6-i) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
			} else {
				for (int j = 1; j <= 5; j++) {
					if(j < i-4) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
