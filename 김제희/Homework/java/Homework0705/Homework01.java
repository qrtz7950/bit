package kr.co.Homework0705;

public class Homework01 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i-1; j++){
				System.out.print("-");
			}
			for(int k=0; k<9-i*2; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
