package day08.abs02;

public abstract class Printer {	//추상메소드

	private String productName;
	public abstract void print();
}
// 메인에서 ptint()를 호출해도, 상속 후 오버라이딩된 엘지 삼성 hp의 각 print()가 호출된다