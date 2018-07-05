package kr.co.mlec.day03.exam;

public class ExamMain02 {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			for(int j=1; j<6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			int a = 5 - i;
			for(int j=0; j<5; j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
		
	}

}
