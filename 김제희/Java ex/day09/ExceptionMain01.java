package kr.co.mlec.day09;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		System.out.println("Main start.......");
		
		Random r = new Random();
		int num = r.nextInt(2);
		System.out.println("num : " + num);
		try {
			System.out.println(1 / num);
		}
		/*
		  catch(ArithmeticException ae) {
			//System.out.println("산수에러발새에에ㅔㅔㅔㅇ");
			//System.out.println(ae.getMessage());
			ae.printStackTrace();
		} catch(NullPointerException ne) {
			//에러는 하나만 발생하는 것이 아니기때문에 캐치를 여러개할수있다
			ne.printStackTrace();
		}
		*/
		
		//여러개를 한번에 캐치가능하도록 변수 통일
		/*
		catch(ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
		*/
		//하지만 어떤 에러가 발생할지 예측할 수 없기때문에 어떤 에러가 뜨더라도 처리하게할수있다
		//묵시적 형변환을 이용해서
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main end.......");
		//예외가 발생하는 예제
	}
}
