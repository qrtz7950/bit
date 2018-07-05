package kr.co.mlec.day03.exam;

public class ExamMain04 {
	
	public static void main(String[] arg) {
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print(' ');
			}
			
			for(int j=0; j<5-i; j++) {
				System.out.print('*');
			}
			
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5; j++) {
				if(j<i){
					System.out.print(' ');
				}
				else{
					System.out.print('*');
				}
			}
			
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<4-i; j++) {
				System.out.print(' ');
			}
			
			for(int j=0; j<1+i; j++) {
				System.out.print('*');
			}
			
			System.out.println();
		}
		
	}

}