package kr.co.mlec.day05;

/*
 * 사물을 특징을 보여주는 클래스가 아니라
 * 
 * 프로그램의 시작과 끝을 알려주기위한
 * 
 * 로직을 설명하기위한 클래스 이것을 비지니스 클래스라고한다.
 * 
 */

class Car{ 
	/*
	 * 브랜드와 최고속도가 궁금했다
	 * 
	 * 차가 가진 많은 속성과 기능중에서 필요한 것은 브랜드와 최고속도
	 * 
	 * 그러면 브랜드와 최고속도를 추상화해야겟쬬?
	 * 
	 */
	String name; //메소드가 아닌 클래스 안에 들어있는 변수는 멤버변수라고한다
	int speed;	//멤버변수는 만들어지면 배열처럼 자동으로 초기화된다 String형은 null 정수실수는 0 불린은 false	
	
	//여기까지는 자동차를 만든것이 아니라 자동차를 추상화하기만한것
	//이것을 실제 차로 만들면 new키워드를 이용하여 new Car();라고 치면 차가 만들어진다
	//이것을 인스턴스화한다고 한다 차를 눈에 보이게 만든것
	///클래스에 의해 만들어진 공간을 인스턴스 객체라고한다
	
}

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car(); 	
/*
		car class를 인스턴스화
		Stack 메모리에 c라는 변수가
		HEAP 메모리에는 자동차 한대가 만들어 졌다
		자동차는 name speed 멤버변수를 가진 공간
		자동차를 가리키는 참조변수를 만든 것
		사용하고 싶은 객체의 갯수만큼 참조변수가 있어야한다
		이제 자동차에 주유하기 자동차 시동키기 같은 자동차를 조작하기 위해서는
		참조변수를 이용하여야한다
		자동차 c의 이름을 알고 싶다면 c.name
*/
		System.out.println("name: " + c.name + " " + "speed: " + c.speed);
		// 자동 초기화로 인해 초기값이 나옴
		// name: null speed: 0
		
		c.name = "곽병문";
		c.speed = 5000;
		System.out.println("name: " + c.name + " " + "speed: " + c.speed);
		//name: 곽병문 speed: 5000
		
		Car c2 = new Car();
		c2.name = "최규성";
		c2.speed = 150;
		System.out.println("name: " + c2.name + " " + "speed: " + c2.speed);
		
		//인스터스 객체를 만들면 그것을 참조할수 있는 참조변수가 있어야한다
		System.out.println("c: " + c);
		System.out.println("c2: " + c2);
		//c: kr.co.mlec.day05.Car@7852e922
		//c2: kr.co.mlec.day05.Car@4e25154f
		//참조변수에는 주소값이 들어있다
		
		
		
		
	}

}
