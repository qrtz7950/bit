package day08.cast;

public class CastMain {

	/*
	 * public static void print(Child01 c) { c.info(); }
	 * public static void print(Child02 c) { c.info(); }
	 */
	public static void print(Parent p) {
		p.info();
	}

	public static void main(String[] args) {

		Parent p = new Parent();
		// p.info();
		print(p);

		Child01 c01 = new Child01();
		// c01.info();
		print(c01);

		Child02 c02 = new Child02();
		// c02.info();
		print(c02);

		p = new Child01(); // 묵시적형변환 발생
		System.out.println(p.name);
		p.info();
	}

}
