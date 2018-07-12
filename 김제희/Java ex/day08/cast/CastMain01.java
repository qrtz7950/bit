package kr.co.mlec.day08.cast;

public class CastMain01 {

/*	
	public static void print(Child01 c) {
		c.info();
	}
	
	public static void print(Child02 c) {
		c.info();
	}
*/	
	
	public static void print(Parent p) {
		p.info();
		
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.study();
			c.play();
		} else if (p instanceof Child02) {
			//((Child02)p).sing();
			Child02 c = (Child02)p;
			c.sing();
			c.sleep();
		} else if (p instanceof Parent) {
			System.out.println("Parents 파라미터전달...");
		} //객체 변수가 어떤 형인지 묻는 이 조건문은 상위 클래스의 경우에는 언제나 트루를 반환하므로 이 조건문은 맨 아래에 있어야함
		
//		System.out.println("p instanceof Child01 : " + (p instanceof Child01));
//		System.out.println("p instanceof Child02 : " + (p instanceof Child02));
//		System.out.println("p instanceof Parent : " + (p instanceof Parent));
//		System.out.println("---------------------");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		//p.info();
		print(p);
		
		Child01 c01 = new Child01();
		//c01.info();
		print(c01);
		
		Child02 c02 = new Child02();
		//c02.info();
		print(c02);
		
		p = new Child01(); //묵시적 객체 형변환이 발생
		System.out.println(p.name);
		p.info();
		
		
		
		
	}

}
