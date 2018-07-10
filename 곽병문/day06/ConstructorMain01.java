package kr.co.mlec.day06;

/*
 *  생성자의 특징
 *  1. 클래스명과 동일
 *  2. 반환형이 존재하지 않음
 *  3. HVM이 디폴트생성자 자동생성(단, 클래스내에 선언된 생성자가 존재하지 않는경우)
 *  4. 오버로딩 지원
 *  5. 객체 멤버변수 초기화
 */

class Car{
	String name;
	int price;
	
	Car(int i){
		System.out.println("생성자 Car(int) 호출...");
	}
	
	Car(String name, int price){
		System.out.println("생성자 Car(str, int) 호출...");
		this.name = name;
		this.price = price;
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {
		
		String s = "차";
		int a = 500;
		Car c = new Car(s, a);
		Car c2 = new Car(a);
		
		System.out.println(c.name + " " + c.price);
	}

}
