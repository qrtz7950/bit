package kr.co.mlec.day08.cast;

public class CastMain02 {

	public static void main(String[] args) {
		
//		Child01 c = new Parent();			// 컴파일 에러
//		Child01 c = (CHild01)new Parent();	// 런타임 에러
		
		Parent p = new Child01();
		Child01 c = (Child01) p;	// 명시적 객체 형변환
		
		p.info();
//		p.study();	// 묵시적 형변환이라 못쓴다
		
		c.info();	
		c.study();
	}

}
