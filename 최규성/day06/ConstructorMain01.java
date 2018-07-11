package day06;
/*
 * 생성자의 특징
 * 1. 클래스명과 동일
 * 2. 반환형이 존재하지않음
 * 3. JVM이 디폴트생성자를 자동생성해줌(단, 클래스내에 선언된 생성자가 존재하지않는 경우)
 * 4. 오버로딩지원
 * 5. 객체 멤버변수 초기화
 */
class Car {
	String name;
	int price;
	
	Car() {	//이게 없어도 JVM이 밑의 new Car를 알아서 처리하기때문에 에러가 나지않음
		System.out.println("디폴트 생성자 Car() 호출...");
	}
	
	Car(int i){
		System.out.println("생성자 Car(int) 호출...");
	}
	Car (String s){
		System.out.println("생성자 Car(String) 호출...");
	}
	Car(String s, double d) {
		System.out.println("생성자 Car(String, double)  호출...");
	}
	
	void Car() {	//클래스랑 파일명을 맞춰야함,소문자로 시작하면 메소드 
		System.out.println("void Car()호출...");
	}
}
public class ConstructorMain01 {

	public static void main(String[] args) {
		Car c = new Car();	//생성자는 new없이는 만들 수 없다.
		c.Car();
		Car c2 = new Car(10);
		Car c3 = new Car("ab");
		Car c4 = new Car("abc",3.3);
		Car c5 = new Car("abcd",10);
		System.out.println();
		
		c = new Car();
		c.name = "소나타";
		c.price = 2700;
		System.out.println();
		
		
		c= new Car("소나타", 2700);
		c2 = new Car("그랜저", 3000);
	}

}
