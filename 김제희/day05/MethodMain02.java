package kr.co.mlec.day05;
/*
 * 
 */
public class MethodMain02 {
	
	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.call(654545454); //오버로딩
		m.call(6545454.54); //오버로딩
		m.call("안니어ㅓㅓㅓㅓㅓㅓㅇㅇㅇㅇㅇ엉ㅇ"); //오버로딩
		m.call("안니어ㅓㅓㅓㅓㅓㅓㅇㅇㅇㅇㅇ엉ㅇ",48585858); //오버로딩
		m.call('A'); //오버로딩 int형으로 묵시적 형변환되서 캐릭터형이 없어도 문제가 안됨
		m.info();
	}

}
