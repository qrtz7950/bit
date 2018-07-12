package kr.co.mlec.day05;
/*
 * 메소드 오버로딩
 * = 자신의 클래스에 메소드명은 동일하면서 매개변수 갯수 또는 자료형이 다른 것
 * 
 * 
 */
public class Method {
	
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(String str) {
		System.out.println("call(String) 메소드 호출...");
	}
	
	void call(String str, int i) {
		System.out.println("call(String, int) 메소드 호출...");
	}

	void info() {
		System.out.println("info() 메소드 호출...");
	}
	
	

}
