package day03;

/*
 * 
 */
public class LoopMain02 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(6 - i);
		}
		System.out.println("----------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("----------");

		for (int i = 1; i <= 5; i++) {			//for 3
			for (int j = 1; j <= i - 1; j++) {
				System.out.print('-');
			}
			for (int k = 1; k <= 6 - i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("-----------");


		for (int i = 1; i <= 5; i++) {			//for 2 if 1
			for (int j = 1; j <= 5; j++) {
				if (j < i) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}

			}System.out.println();
		}

		/*
		 * for (int i = 1; i <= 5; i++) { // 이중반복문
		 * 
		 * for (int j = i; j >= i+5; j--) { System.out.print(j);
		 * 
		 * }
		 * 
		 * System.out.println(); }
		 */
		//System.out.println("----------");

		

	}

}
