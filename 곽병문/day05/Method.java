package kr.co.mlec.day05;

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
	
	void call(String d) {
		System.out.println("call(String) 메소드 호출...");
	}
	
	void call(String d, int i) {
		System.out.println("call(String, int) 메소드 호출...");
	}
		
	void info() {
		System.out.println("info() 메소드 호출...");
	}
	
	Method() {
		System.out.println("생성자다!");
	}
}
