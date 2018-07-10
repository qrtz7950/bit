package day05;

/*
 *	 	 void라는 반환명은 호출자 피호출자 서로의 필요한 값에 간섭가능하다.
 */
public class MethodMain01 {

	/*
	 * static void prnStar(int cnt) { //static을 추가하여 prnStar(); 호출가능
	 * 
	 * for(int i = 0; i< cnt; i++) { 
	 * 		System.out.print('*'); 
	 * } System.out.println();
	 * 
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * 		prnStar(10); //메소드 호출/ 괄호안의 10은 'int cnt' 호출자가 피호출자에 간섭
	 * 		System.out.println("Hello"); 
	 * 		prnStar(5);
	 * 		System.out.println("Hi");
	 * 		prnStar(20);
	 * 		System.out.println("Good-bye"); 
	 * 		prnStar(12);
	 * 
	 * }
	 */

	/*
	 * static void prnStar(char ch) {
	 * 
	 * for (int i = 0; i < 10; i++) { System.out.print(ch); // 피호출자가 호출자에 간섭 }
	 * 		System.out.println();
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * 		prnStar('*'); // 메소드 호출/ 괄호안의 10은 'int cnt' 
	 * 		System.out.println("Hello");
	 * 		prnStar('#'); 
	 * 		System.out.println("Hi"); 
	 * 		prnStar('-');
	 *		System.out.println("Good-bye"); 
	 *		prnStar('!');
	 * 
	 * }
	 */
	
	static void prnStar(char ch, int cnt) {	//두개의 파라미터에 간섭가능하게 함

		for (int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();

	}
	static int calc(int a, int b) { 	//int는 리턴값의 자료형
		
		int sum = a + b;
		return sum;		//a와 b의 합인 sum을 main에 전달/return을 만나면 main으로 강제 복귀
	}

	public static void main(String[] args) {

		
		int total = calc(10,20); 	//calc로 이동 / total은 리턴값 sum의 30을 갖게됨
		System.out.println("10 + 20 = " + total);
		prnStar('*', 10);
		System.out.println("Hello");
		prnStar('#', 20);
		System.out.println("Hi");
		prnStar('-', 30);
		System.out.println("Good-bye");
		prnStar('!', 3);

	}
}
