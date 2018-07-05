package day03;

public class LoopMain01 {

	public static void main(String[] args) {
		
		System.out.println("for----");
		for(int i=1;i<=9;i++) {		//i는 지역변수
			System.out.println(i);
		}
		
		System.out.println("while-----");
		int z = 9;
		while (z > 0) {				//괄호안의 조건이 충족되면 실행
			System.out.println(z);
			z--;
		}
		
		/*System.out.println("do while----");
		int x = 10;
		do {
			System.out.println(x);
			x--;
			} while (x >= 0); 			
		
		for(int i =0; i<=5; i++) {
		}*/
		
	}

}
