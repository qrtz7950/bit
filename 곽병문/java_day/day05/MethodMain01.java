package kr.co.mlec.day05;

public class MethodMain01 {
	
	public static void main(String[] args) {
		
		int total = calc(15,4456);
		System.out.println(total);
		
		
	}
	
	static int calc(int a, int b) {
		
		int sum = a + b;
		
		return sum;
	}
	
}