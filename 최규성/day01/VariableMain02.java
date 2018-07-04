package kr.co.mlec;

public class VariableMain02 {

	public static void main(String[] args) {
		
		int num = 10; //정수 10 num에 생성
		num = 200; //200으로 변경
		System.out.println(num);
	
		String str = "hello";
		
		str = "world";
		System.out.println("str: " + str);
		
		String myStr = new String("hello"); //참조자료형: myStr는 "hello"가 들어있는 또 다른 String 공간을 가리키고만 있어 "hello"를 갖고있지않는다.
		System.out.println(myStr);
	}

}