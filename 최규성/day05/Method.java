package day05;

public class Method {

	void call() {
		System.out.println("call() 메소드 호출...");
	}

	void call(int i) {		//메소드 오버로딩은 반환형으로 구분자 역할 x
		System.out.println("call(int) 메소드 호출...");
	}

	void call(double d) {	//같은 call이지만 변수형에 따라 다르게 구분됨 
		System.out.println("call(double) 메소드 호출...");
	}

	void call(String str) {
		System.out.println("String 메소드 호출...");
	}

	void call(String str, int j) {
		System.out.println("call(String, int) 메소드 호출...");
	}

	void call(char ch) {
		System.out.println("char 메소드 호출...");
	}

	void info() {
		System.out.println("info() 메소드 호출...");
	}
}
