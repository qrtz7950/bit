package day02;
/*
 * 	형변환
 *  =, +, -, ... (연산자)를 기준으로 좌우의 자료형의 타입이 서로다를때 발생
 *  A = B;
 *  
 *  byte < short, char < int < long < float < double (범위)
 *  
 *  종류
 *  1. 묵시적 형변환: 자료의 범위가 좁은 자료형에서 넓은 자료형으로의 변환은 시스템이 자동으로 행함
 *  	double = int;
 *  	long = byte;
 *  
 *  	ex) double num;
 *  		int i =20;
 *  		
 *  		num = (double) i; (좌우의 자료형이 다르기 때문에 괄호를 사용해서 일시적으로 형변환해서 사용한다. 괄호를 생략할 수 있으면 묵시적형변환, 그럴 수 없는 경우는 강제적 형변환)
 *  2. 강제적 형변환: 자료의 범위가 넓은 자료형에서 좁은 자료형으로의 변환은 시스템에서 자동으로 수행할 수 없으며 프로그래머가 강제로 변환해야함
 */
public class CastMain {

	public static void main(String[] args) {

		double d;
		
		d = (double) 10; //형변환 double  = (double)int
		System.out.println("d: " + d);  //출력값: 10.0
		
		
		int num;
		
		num =(int) 12.34; //int형에 실수 저장해서 형변환을 위해 (int) 추가
		System.out.println("num: " +num);
		
		System.out.println((int)12.0/(int)3.49); //실수 나눗셈의 몫만을 출력
		System.out.println((int)(10.2/3.7));
		
	}

}
