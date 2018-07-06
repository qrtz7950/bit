/*
	*       *
	**     **
	***   ***
	**** ****
	*********
	**** ****
	***   ***
	**     **
	*       *
*/
package day03Hw;



public class Hw03 {

	public static void main(String[] args) {

		int line =11;
		int k = 1;
		for(int i = 1; i<=line; i++) {
			for(int j=1; j<=line; j++) {
				if(j<=k || j>line-k) {
					System.out.print('*');
				} else {
					System.out.print('-');
				}
			}
			System.out.println();
			if(i<=line/2) {
				k++;
			} else {
				k--;
			}
		}
		
		/*int k = 1;
		for(int i = 1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j<=k || j>=10-k) {
					System.out.print('*');
				} else {
					System.out.print('-');
				}
			}
			System.out.println();
			if(i<5) {
				k++;
			} else {
				k--;
			}
		}*/
		
		
		/*for (int i = 1; i <= 9; i++) {
			if (i <= 4) {
				for (int j = 1; j <= 9 - i; j++) {
					if (j <= i) {
						System.out.print('*');
					} else {
						System.out.print('-');
					}
					
				}for (int j = 1; j < i + 1; j++) {
						System.out.print('*');
					}
				System.out.println();
				
			} else if (i == 5) {
				for(int j = 1; j <=9; j++) {
					System.out.print('*');
				};
				System.out.println();

			} else {
				for (int j = 1; j <= 9-i; j++) {
					if (j <=10-i) {
						System.out.print('*');
					} else 
						System.out.print('-');
					
				}for (int j = 1; j <= 10-i; j++) {
						System.out.print('*');
					}
				System.out.println();
			}
		}*/
	}
}
