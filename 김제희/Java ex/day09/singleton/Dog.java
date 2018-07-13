package kr.co.mlec.day09.singleton;

public class Dog {
	
	private static Dog instance = null;

	private Dog() {
		//생성자를 private로해서 생성자를 사용불가하게함
	}
	
	public static Dog getInstance() {
		//생성자를 사용할 수 없기 때문에 객체를 반환하는 메소드가 필요
		//객체도 생성할 수 없기때문에 static메소드와 static 멤버변수를 이용해야한다
		if(instance == null) { //지역변수가 아닌 스태틱 변수 사용
			instance = new Dog();
		}
		return instance;
	}
	
	//이렇게 클래스당 하나의 객체만을 만들고 싶을  때는 생성자를 private로 바꿔야한다
	//이것을 singleton 패턴이라고 한다
	//아래의 한줄로 위의 방법론을 요약가능하다
	//private static final Dog instance = new Dog();
	//자매품 팩토리 패턴
	
}
