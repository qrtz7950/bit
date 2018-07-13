package day09.exam;

//하나의 클래스로 하나의 객체를 만드는 경우를 Singleton 패턴이라고 한다.

public class Dog {

	private static Dog instance = null;
	
/*	private static final Dog instance = new Dog();	
	이렇게 쓰면 밑의 getInstance를 쓰지않아도된다.
	보통 싱글톤을 사용할때는 이렇게 쓰게된다.
*/	
	private Dog() {
	}
	
	
	
	public static Dog getInstance(){	//Dog가 프라이빗이기 때문에 현재 클래스에서 생성하여
		//return new Dog();		//Main에서 쓸수있게 할수있다.하지만 메인에서 호출할수없기때문에 public static을 붙인다.
		
		//객체를 한번만 생성하기 위해
		if(instance == null) {
			instance = new Dog();
		}
		return instance;
	}						//실행하면 d,d2가 하나의 객체 주소값을 가리킨다.
}
