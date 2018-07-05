package kr.co.mlec.day03.exam;

public class ExamMain05 {

	public static void main(String[] args) {
		
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int k=0; k<i+1; k++) {
					System.out.print('*');
				}
			}
			else {
				for(int k=0; k<9-i; k++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}

	}

}
