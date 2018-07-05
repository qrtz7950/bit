package kr.co.mlec.day02;
	/*
	 * 형변환
	 * =(대입연산자)를 기준으로 좌우의 자료형의 타입이 서로 다를때 발생
	 * ex) A=B; 일때 A와 B의 자료형이 서로 다를때
	 * 형 변환은 기본자료형 8가지중 boolean형을 제외한 나머지에서 존재한다
	 * 
	 * 숫자의 범위
	 * 
	 * byte < short < int < ling < float < double
	 * 		 (char)
	 * 
	 * 종류 
	 * 1.묵시적형변환
	 * 	크기가 작은 타입이 값이 더 큰 자료형의 값으로 대입될 때 묵시적 형변환이다.
	 * 	EX) double num = int;
	 * 		long = byte;
	 * 	EX) 또한 연산자를 기준으로도 묵시적형변환이 일어난다
	 * 		int num01 = 3;
	 * 		double num02 = 2.2525;
	 * 		num01 + num02 = 5.2525;
	 * 2.강제적 형변환 or 명시적 형변환
	 * 	double num;
	 * 	int i = 20;
	 * 
	 * 	num = (doulbe) i;
	 * 	다음과 같은 형변환의 경우 (double)을 생략할 수 있다면 묵시적 형변환 생략할수 없다면 강제적 또는 명시적 형변환
	 */
public class CastMain {

	public static void main(String[] args) {
		double d;
		d = 10; //묵시적형변환 발생 double d = (double) int;
		System.out.printf("d: %f\n",d);
		
		int num;
		
		//num = 12.34; 형변환 int = double; = 에러
		num = (int)12.34;
		System.out.printf("num: %d\n",num);
		
		System.out.println((int)10.0/(int)3.0);
		System.out.println((int)(10.0/3.0));
		//나누기에서 나머지를 버린 몫의 값만 얻기 위해 형변환을 한 값을 출력하거나 계산한 값을 형변환했다
		
		
	}

}
