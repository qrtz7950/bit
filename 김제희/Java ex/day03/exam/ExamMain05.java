package kr.co.mlec.day03.exam;

public class ExamMain05 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			if (i < 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print('*');
				}
			} else {
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	
		int star = 1;
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print('*');
			}
			System.out.println();
			if(i<5) {
				star++;
			} else {
				star--;
			}
			
		}
		
		
		
	}

}
