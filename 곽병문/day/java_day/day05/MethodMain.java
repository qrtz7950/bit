package kr.co.mlec.day05;

/*
 		**********
 		Hello
 		**********
 		Hi
 		**********
 		Good-bye
 		**********
 */

public class MethodMain {

	static String print(int i, String str) {
		switch(i) {
			case 1 :
				System.out.println("Hello");
				break;
			case 3 :
				System.out.println("Hi");
				break;
			case 5 :
				System.out.println("Good-bye");
				break;
			default :
				System.out.println("**********");
		}
		str = str+str;
		
		return str;
	}
	
	public static void main(String[] args) {
		
		String a = new String();
		
		for(int i=0; i<7; i++) {
			a = print(i, "ũũũ");
		}
		
		System.out.println(a);
		
	}
}
