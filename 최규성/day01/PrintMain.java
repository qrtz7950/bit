package kr.co.mlec;

public class PrintMain {

	public static void main(String[] args) {
		System.out.println("11111"); //개행문자 포함
		System.out.print('ㅁ');//개행문자 미포함, 문자('A') 정수(3) 실수(3.14) 문자열("ABCdef") 4가지 상수 출력 가능
		System.out.print(3);
		System.out.print(3.14);
		System.out.print("ABCDEF");
		System.out.printf("33333"); //개행문자 미포함, 변환문자 사용(%c(문자) ,d(정수),  x, o, f(실수), d, s(문자열) JDK1.5이상 printf사용가능
		System.out.printf("%c",'A');
		System.out.printf("%s","ABC");
		System.out.printf("%d", 123);
		System.out.printf("%.4f", 123.456);
		System.out.printf("문자: %s, 정수: %d","ABC", 123);
		System.out.println('A' + 'B'); //131(아스키코드 합)
		System.out.println('\u0041'); //A (유니코드)
		System.out.printf("[%6d]",3);
		System.out.printf("[%-6d]", 6);
	}

}
