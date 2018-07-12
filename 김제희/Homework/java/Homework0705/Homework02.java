package kr.co.Homework0705;

public class Homework02 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			if(i<5) {
				for(int j = 1; j<= 5-i; j++) {
					System.out.print("-");
				}
				for(int k = 1; k<= i*2-1; k++) {
					System.out.print("*");
				}
			} else {
				for(int j = 1; j<= i-5 ; j++) {
					System.out.print("-");
				}
				for(int k = 1; k <= 19-2*i; k++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}

}
