package kr.co.mlec.homework.homework02;

/*
 	    *
 	   ***
 	  *****
 	 *******
 	*********
 	 *******
 	  *****
 	   ***
 	    *
 */

public class Homework02_02 {

	public static void main(String[] args) {
		
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0; j<5+i; j++) {
					if(j<4-i) {
						System.out.print(' ');
					}
					else {
						System.out.print('*');
					}
				}
			}
			else {
				for(int j=0; j<13-i; j++) {
					if(j<i-4) {
						System.out.print(' ');
					}
					else {
						System.out.print('*');
					}
				}
			}
			System.out.println();
		}
		
	}

}
