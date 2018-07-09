package kr.co.mlec.day05;

/*
 * **********
 * hello
 * **********
 * Hi
 * **********
 * Good-bye
 * **********
 * 
 */

public class MethodMain01 {

	static void printStar(int cnt,char c) {
		for(int i=0; i<cnt; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	static int calc(int a, int b) {
		int sum = a + b;
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		
		printStar(10, 'a'); //함수를 호출했다라고한다
		System.out.println("hello");
		printStar(20, 'a');
		System.out.println("Hi");
		printStar(30, 'a');
		System.out.println("Good-bye");
		printStar(40, 'a');
		
		System.out.println(calc(3,5));
		
	}

}
