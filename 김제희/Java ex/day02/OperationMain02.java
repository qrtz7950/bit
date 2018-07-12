package kr.co.mlec.day02;

public class OperationMain02 {

	public static void main(String[] args) {
		
		int a = 1, b = -1, c = 0;
		System.out.println(++a >= 0 && ++b < 0 && c++>0);
		//false
		//a = 2, b= 0, c = 0
		//첫번째 논리 연산이 거짓이기 때문에 뒤에 있는 c++을 보지 않는다 그래서 c++연산이 되지 않아 결과값은 c=0
		//컴퓨터의 논리연산의 경우의 수는 3개기 떄문에 나오는 결과
		System.out.println(a-- != 0 && ++b == 0 && ++c == 0);
		//false
		//a = 0, b= 0, c = 1
		System.out.println(--a < 0 && b-- <= 0 || c-- >= 0);
		//ture
		//a = 0, b= -1, c = -1
		System.out.println(a++ >= 0 || ++b < 0 && --c <= 0);
		//ture
		//a = 2, b= -1, c = 0
		System.out.printf("a = %d, b= %d, c = %d\n", a,b,c);
		
		}

}
