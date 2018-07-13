package kr.co.mlec.day09;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {

		Random r = new Random();
		int n = r.nextInt(2);
		System.out.println("num : " + n);
		try {
			System.out.println(1/n);
			String str= null;
			System.out.println(str.length());
		} 
		/*catch(ArithmeticException e) {
			System.out.println("0으로 나누다니");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}*/
		/*catch(ArithmeticException | NullPointerException e){
			e.printStackTrace();
		}*/
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("너무해");
		}

	}

}
