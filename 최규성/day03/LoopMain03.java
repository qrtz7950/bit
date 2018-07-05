package day03;

public class LoopMain03 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {				//for 3 if 1
			if (i <= 5) {
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
		System.out.println("--------------------");
		
		for (int i = 1; i <= 9; i++) {				//for 5 if 1
			if (i <= 5) {
				for (int j = 1; j <= 5-i; j++) {
					System.out.print('-');
				}
				for(int k = 1; k <= i; k++) {
					System.out.print('*');
				}
			} else {
				for (int j = 1; j <= i-5; j++) {
					System.out.print('-');
				}for(int k = 1; k <= 10 -i; k++) {
					System.out.print('*');
				}
			}

			System.out.println();
		}
		System.out.println("--------------------");
		
		
		int star =1 ;								//for 2 if 1
		for(int i =1; i <=9; i++) {
			for(int j = 1; j <= star; j++) {
				System.out.print('*');
			}
			System.out.println();
			if(i < 5) {
				star++;	
			}else {
				star--;
			}
		}
		
	}

}
