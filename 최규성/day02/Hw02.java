package day02;

public class Hw02 {

	public static void main(String[] args) {
		
		int a = 3661;
		int h, m, s;
		
		h = a%60;
		m = h%60;
		s = m%60;
		
		System.out.println("결과 출력: " + h +"시간" + m + "분" + s + "초");
	}

}
