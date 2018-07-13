package day09;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {

		System.out.println("Main Start");
		
		Random r = new Random();
		int num = r.nextInt(2);

		System.out.println("num: "+ num);
		
		try{	
			System.out.println(1 / num);	//분모가 0,1로 0일때 에러발생
			
			String str = null;
			
			System.out.println("length: " + str.length());
		}catch(Exception e) {	//모든 예외처리가 가능한 처리구문, 이것만 쓴다.
			e.printStackTrace();
		}
		
		/*catch(ArithmeticException | NullPointerException e) {	// | 을 사이에 두고 여러개 사용가능
//			System.out.println("ArithmeticException 발생...");
//			System.out.println(ae.getMessage());
			e.printStackTrace();
		}
		*/
		
		System.out.println("Main End");
	}

}
