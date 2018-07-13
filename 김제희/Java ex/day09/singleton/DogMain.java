package kr.co.mlec.day09.singleton;

public class DogMain {

	public static void main(String[] args) {
//		Dog d = new Dog();
//		Dog d2 = new Dog();
		
		Dog d = Dog.getInstance();
		Dog d2 = Dog.getInstance();
		
		
		System.out.println(d);
		System.out.println(d2);
		//서로 다른 객체 다른 주소값을 가진다
		
		//하나의 객체만을 생성하여 사용하고 싶다면 어떻게하나
		//Dog 클래스를 이용해 만들어지는 객체는 언제나 한개인 걸로
		
	}

}
