package day08.abs01;

public class SamsungPrinter extends Printer{
	
	//메소드 오버라이딩
	public void Print() {	//상속받은 Printer 클래스의 Print메소드와 같게 해주고 정의만 다르게 함
		System.out.println("삼성프린트에서 출력됨");
	}
	
	public void samsungPrint() {
		System.out.println("삼성프린트에서 출력됨");
	}
}
