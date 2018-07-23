package kr.co.mlec.day09.singleton;

public class Dog {						// Singleton pattern : 하나의 클래스에 하나의 객체만 사용
	
	private static final Dog d = new Dog();
	
	private Dog() {}
	
	static Dog getInstance() {
		return d;
	}
}
