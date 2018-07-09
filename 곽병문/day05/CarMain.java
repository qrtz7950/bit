package kr.co.mlec.day05;

class Car{
	
	String name;			// 멤버변수1
	int speed;				// 멤버변수2
	
	void open(){
		System.out.println("Nope!");
	}
	
}

public class CarMain {

	public static void main(String[] args) {
		
		Car slow = new Car();		// Car() -> 메모리 할당됨 -> instance object
								// 생성된 후 객체 멤버변수 다 초기화됨
		slow.name = "느린차";
		slow.speed = 10;
		slow.open();
		
		System.out.println("name : " + slow.name + "\nspeed : "+ slow.speed + "km/h");
		
		Car fast = new Car();
		
		fast.name = "빠른차";
		fast.speed = 1000;
		System.out.println("name : " + fast.name + "\nspeed : "+ fast.speed + "km/h");
		
		System.out.println(slow + "\n" + fast);
		
		
		
	}
	
}
