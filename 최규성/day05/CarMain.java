package day05;

class Car{			//추상화된 클래스
	String name;   	//main 메소드밖의 변수들은 멤버변수라고 부른다.
	int speed;
}

public class CarMain {

	public static void main(String[] args) {

		Car c = new Car();	//instance 객체(추상화클래스를 이용해서 실제하는 객체를 생성)
	
		System.out.println("name:" + c.name+ ",speed: "+ c.speed);
		c.name = "소나타";
		c.speed = 200;
		System.out.println("name:" + c.name+ ",speed: "+ c.speed);
		
		Car c2 = new Car();
		c2.name = "그랜저";
		c2.speed = 220;
		System.out.println("name:" + c2.name+ ",speed: "+ c2.speed);

		
		System.out.println(c);
		System.out.println(c2);
	}

}
