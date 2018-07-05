package kr.co.Homework0705;

public class Homework03 {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			if (i < 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print('*');
				}
				for (int j = 1; j <= 9-2*i; j++) {
					System.out.print('-');
				}
				for (int j = 1; j <= i; j++) {
					System.out.print('*');
				}
			} else if(i==5) {
				for (int j = 1; j <= 2*i-1; j++) {
					System.out.print('*');
				}
			} else {
				for (int j = 1; j <= 10-i; j++) {
					System.out.print('*');
				}
				for (int j = 1; j <= 2*(i-5)-1; j++) {
					System.out.print('-');
				}
				for (int j = 1; j <= 10-i; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		
	}

}
