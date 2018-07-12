package kr.co.mlec.day08.cast;

public class CastMain01 {
	
	public static void print(Parent p) {
		p.info();
		
		if(p instanceof Child01) {
			Child01 c = (Child01) p;
			c.study();
			c.play();
		}else if(p instanceof Child02){
			Child02 c = (Child02) p;
			c.sing();
			c.sleep();
		}else if(p instanceof Parent) {
			System.out.println("Parent 파라미터 전달...");
		}
		
//		System.out.println("p instanceof Child01 : " + (p instanceof Child01));
//		System.out.println("p instanceof Child02 : " + (p instanceof Child02));
//		System.out.println("p instanceof Parent : " + (p instanceof Parent));
//		System.out.println("============================================");
	}

	public static void main(String[] args) {
		
		Parent p = new Parent();
		print(p);
		
		Child01 c01 = new Child01();
		print(c01);						// 묵시적 형변환

		Child02 c02 = new Child02();
		print(c02);						// 묵시적 형변환
		
		p = new Child01();				// 묵시적 형변환
		print(p);						// 묵시적 형변환한 거 오버라이딩 우선
		
	}

}
