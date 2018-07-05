package kr.co.mlec.homework.homework02;

/*
 	*********
 	 *******
 	  *****
 	   ***
 	    *
 */
public class Homework02_01 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<9-i; j++) {
				if(j<i) {
					System.out.print(' ');
				}
				else {
					System.out.print('*');					
				}
			}
			System.out.println();
		}
		
	}

}
