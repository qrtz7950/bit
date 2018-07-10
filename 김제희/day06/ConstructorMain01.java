package kr.co.mlec.day06;

/*
 * 생성자의 특징
 * 1. 클래스명과 동일
 * 2. 반환형이 존재하지 않음
 * 3. JVM이 디폴트생성자 자동생성(단, 클래스내에 선언된 생성자가 존재하지 않는경우)
 * 4. 오버로딩 지원
 * 5. 객체 멤버변수 초기화
 */

class Car {
	String 	name;
	int 	price;
	
	Car() {
		System.out.println("디폴트 생성자 Car() 호출...");
	}
	
	Car(int i) {
		System.out.println("생성자 Car(int) 호출...");
	}
	
	Car(String s) {
		System.out.println("생성자 Car(String) 호출...");
	}
	
	Car(String s, double d) {
		System.out.println("생성자 Car(String, double) 호출...");
	}
	
	//앞에 반환형이 생기면 더 이상 생성자가 아니라 일반 메소드가 된다
	void car() {//생성자 이름을 가지는 것은 좋지 않은 방법이기 때문에 소문자로 메소드 이름을 써준다
		System.out.println("void Car() 호출...");
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {
		Car c = new Car();
		c.car();
		Car c2 = new Car(10);
		Car c3 = new Car("ab");
		Car c4 = new Car("abc", 3.45);
		Car c5 = new Car("abcd", 10); //int-<doble 형으로 묵시적 형변환
		
		c = new Car("소나타",2700);
		c2 = new Car("그랜저",2400);
	}	
}








