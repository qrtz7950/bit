package kr.co.mlec.day08.cast;

public class CastMain02 {
	public static void main(String[] args) {
		
//		Child01 c = new Parent();			//컴파일 에러
//		Child01 c = (Child01)new Parent();	//런타임 에러
		
		Parent p = new Child01();
		Child01 c = (Child01)p; //명시적 객체형변환
		
		p.info();	//Child01형의 메소드가 오버라이딩된다
//		p.study(); 	//Child01형이지만 부모클래스에 속한 메소드가 아니기 때문에 호출 불가
		
		c.info();
		c.study();
		
	}
}
