package kr.co.mlec.day05;

/*
 * 메소드 오버로딩(overloading)
 * 	: 자신의 클래스에 메소드명은 동일하면서 "매개변수"의 개수 또는 자료형이 다른것
 */

public class MethodMain02 {

	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.info();
		m.call(1);
		m.call(1.1);
		m.call("hi");
		m.call("hihi",1);
		m.call('A');			// ★ 묵시적형변환 하여 실행 가능한 정의가 되있으면 오류 안남
		
	}

}
