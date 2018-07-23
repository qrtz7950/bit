package kr.co.mlec.homework.homework02;

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

public class Homework02_03 {

	public static void main(String[] args) {
		
		for(int i=0; i<9; i++) {
			if(i<4) {
				for(int j=0; j<8-i; j++) {
					if(j<=i) {
						System.out.print('*');
					}
					else {
						System.out.print(' ');
					}
				}
				for(int j=0; j<i+1; j++) {
					System.out.print('*');
				}
			}
			else if(i==4){
				for(int j=0; j<9; j++) {
					System.out.print('*');
				}
			}
			else {
				for(int j=0; j<i; j++) {
					if(j<9-i) {
						System.out.print('*');
					}
					else {
						System.out.print(' ');
					}
				}
				for(int j=0; j<9-i; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
	}

}
