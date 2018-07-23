package kr.co.mlec.day01;

public class VariableMain02 {

	public static void main(String[] args) {
		
		int num = 10;			// 정수 10을 저장하는 변수 num 생성
		
		num = 200;				// num 값을 200으로 변경
		
		String str = "hello";	// 문자열 "hello" 저장하는 변수 str 생성
		
		str = "world";			// str 값을 world로 변경
		
		System.out.println("str : " + str);
		
		Test t = new Test();
		t.a = 1;
		t.str = "aa";
		
		System.out.println(t.a + t.str);
		

	}

}

class Test{
	int a;
	String str;
}