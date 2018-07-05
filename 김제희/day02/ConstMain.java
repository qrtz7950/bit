package kr.co.mlec.day02;

public class ConstMain {

	public static void main(String[] args) {
		int radius = 10;
		final double PI = 3.14;		//변수를 상수처럼 사용하게 해주는 final 키워드
									//final키워드가 붙여진 변수는 대문자로 쓴다
		
		System.out.printf("원둘레는: " + (2 * radius * PI));
									//int * int * double
									//왼쪽부터 2개씩 계산하여 int * int = int
									// int * double = double
		
		//pi = 3.141592;
		//System.out.printf("원둘레는: " + (2 * radius * PI));
		//final키워드가 쓰였기 때문에 값을 바꾸려고 할 경우 오류가 난다
	}
}
