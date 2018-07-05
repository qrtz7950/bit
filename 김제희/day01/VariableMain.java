package kr.co.mlec.day01;

/*
 * 기본자료형은 8가지가 있다
 * - 논리형: boolean (1)
 * - 정수형: byte(1), short(2), int(4), long(8)
 * - 실수형: float(4), double(8)
 * - 문자형: char(2)
 * 괄호안의 숫자는 자료형이 몇비트인지를 표현 float(4) = float는 4바이트 실수자료형
 */
public class VariableMain {

	public static void main(String[] args) {
		//자료형 변수명;
		//자료형만큼을 공간을 할당하고 그 공간의 이름을 변수명이라고한다
		char c; //변수의 선언부
				//문법적인 오류를 막기위해서 변수명은 숫자로 시작할수 없다 문자로만 선언가능
		c ='A'; //변수의 대입부,치환부
		System.out.println("문자: " + c);
		System.out.printf("문자: %c\n", c);
		
		int num; //절차지향 C와는 다르게 변수 선언을 어느 곳에 해도 괜찮다
		
		num = 123;
		
		System.out.println("정수: "+ num);
		
		double d;
		d = 12.345;
		System.out.printf("실수: %f\n",d); 	//12.345000
		System.out.printf("실수: %.4f\n",d); 	//12.3450
		System.out.printf("실수: %.3f\n",d); 	//12.345
		
		boolean bool;
		bool = true;
		System.out.printf("논리값: %b\n",bool);
		
		char ch = 'A'; 		//선언부와 대입부는 동시에 쓸 수 있다.
		System.out.printf("ch: %c\n", ch);
		
		//int num2;
		//System.out.printf("num2: %d", num2);
		//초기화하지 않으면 C처럼 쓰레기값이 나오는게 아니라 에러가 난다
		
		ch = 'B'; //미리 선언되어있는 변수는 자료형 없이도 새로운 값으로 치환할 수 있다
		System.out.printf("ch: %c\n", ch);
		
		ch = '\u0042'; //유니코드로도 표현가능
		System.out.printf("ch: %c\n", ch);
	}

}
