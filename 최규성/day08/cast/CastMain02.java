package day08.cast;

public class CastMain02 {

	public static void print(Parent p) {
		p.info();
		
		
		if(p instanceof Child01) {	//p가 Child01의 객체인지 묻는 불린값을 알려줌
			Child01 c= (Child01)p;
			c.study();
			c.play();
		} else if(p instanceof Child02) {
			//((Child02)p).sing();
			Child02 c = (Child02)p;
			c.sing();
			c.sleep();
		} else if(p instanceof Parent) {
			System.out.println("Parent 파라미터 전달...");
		}
	}
	/*	System.out.println
	 * ("p instanceof Child01: "+ (p instanceof Child01));
		System.out.println("p instanceof Child02: "+ (p instanceof Child02));
		System.out.println("p instanceof Parent: "+ (p instanceof Parent));
	}*/
	
	public static void main(String[] args) {
		
		
//		Child01 c = new Parent(); //컴파일시 에러
//		Child01 c = (Child01)new Parent(); //실행하면 에러
		
		Parent p = new Child01();//묵시적 형변환
		Child01 c =(Child01) p;	//명시적 객체형변환 해줌
		
		p.info();
		c.info();	//위와 같은 출력

		c.study();
		
	}
}
