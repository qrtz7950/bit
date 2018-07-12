package day08.cast;

public class Child02 extends Parent {

	private String name = "둘째 자식";
	
	public void sing() {
		System.out.println("노래하기");
	}
	public void sleep() {
		System.out.println("수면");
	}
	public void info() {
		System.out.println("나는 재정의된 Child02 info()메소드입니다");
	}
	
	
}
