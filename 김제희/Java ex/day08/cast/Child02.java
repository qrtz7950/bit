package kr.co.mlec.day08.cast;

public class Child02 extends Parent {
	
	public String name = "두번째 자식";
	
	public void sing() {
		System.out.println("나는 노래부릅니다");
	}
	public void sleep() {
		System.out.println("나는 잡니다");
	}
	public void info() {
		System.out.println("나는 재정의된 child02 info()메소드입니다");
	}

}
