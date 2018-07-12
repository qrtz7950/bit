package kr.co.mlec.day01;

/*
 * 출력메소드에는
 * System.out.print()
 * System.out.println()
 * System.out.printf()
 * 세 개의 메소드 모두 쌍따옴표 안의 내용을 출력하는 메소드이다
 * 다른 점을 알아보자
 */

public class PrintMain {

	public static void main(String[] args) {
		System.out.println(3);		//정수
		System.out.println(3.14);	//실수
		System.out.println("ABC");	//문자열
		System.out.println('A');	//문자
		//printf() 메소드는 개행문자를 포함하지않음, 변환문자를 사용(%c, %d, %x, %o, %f, %d) JDK 1.5이후부터 사용가능
		System.out.printf("%c\n", 'A');
		System.out.printf("%d\n", 3);
		System.out.printf("%.2f\n", 3.14);
		System.out.printf("%s\n", "ABC");
		System.out.printf("문자: %s 정수: %d\n", "ABC" , 3);
		//printf() 메소드를 잘 이용하면 한줄에 여러 자료형을 출력가능하다
		//자바에서 더하기 연산은 다른 타입의 자료형도 자동으로 변환해준다
		System.out.printf("문자: " + 'A' + ", 정수: " + 3 +"\n");
		//문자:A, 정수:3
		System.out.println('A'+"BC");	//ABC
		System.out.println(3 + 4);		//7
		System.out.println(2.3 + 5);	//7.3
		System.out.println('A' + 'B');	// 131
		// 문자끼리의 더하기 연산은 아스키코드값을 더한 값으로 표현된다 A+B = 131 A=65 B=66
		// 자바는 유니코드 기반의 언어이다
		System.out.println('\u0041');	//A
		// 1 + 2 = 3을 표현해보자
		System.out.println(1 + "+" + 2 + "=" +1+2); //1+2=12
		//자바에서 연산은 왼쪽에서부터 두개씩 계산하기때문에 첫번째 계산 1 과 +를 더하면 string형으로 변환된다
		//이후의 계산도 모두 string형이 되기 때문에 결과값이 12가 나오게된다
		System.out.println(1 + "+" + 2 + "=" + (1+2)); //1+2=3
		// 1+2 연산을 먼저실행해서 3으로 나오게할수있다
		System.out.printf("%d + %d = %d\n",1 ,2 ,3); //1+2=3
		// 변환문자를 이용하여 좀더 간단하게 표현 가능하다
		System.out.println("[    A]");
		//****A
		System.out.println("[   12]\n\n");
		//***12
		//앞에 공백 맞추기가 너무 어렵네요 쉽게 해봅시다
		System.out.printf("[%5c]\n", 'A');
		System.out.printf("[%5d]\n", 12);
		//[    A]
		//[   12]
		System.out.printf("[%-5c]\n", 'A');
		System.out.printf("[%-5d]\n", 12);
		//[A    ]
		//[12   ]
		System.out.printf("%f\n", 3.23); // 3.230000
		System.out.printf("%.2f\n", 3.23); // 3.23
		//소수점 자리 제한 가능
	}
}