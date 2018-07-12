package kr.co.mlec.day01;

/*
 * 네이밍률에 의거하여 클래스,변수,메소드의 개수를 구하시요
 */

public class NamingMain {

	public static void main(String[] args) {
		int i = Integer.parseInt("345");
		System.out.println(i);
		/*
		 *클래스의 개수 = 4개 (NamingMain, String, Integer, System) 
		 *변수의 개수 = 3개 (i, args, out)
		 *메소드의 개수 = 3 (main() parseInt() println())
		 *자줏빛으로 보이는 단어들은 예약어라고한다 (public static void)
		 */
	}

}
