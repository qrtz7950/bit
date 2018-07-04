package day02;
import java.util.Random;
/*
 * Random 클래스 : 임의의 정수를 추출하는 기능하는 클래스
 */
public class RandomMain {

	public static void main(String[] args) {
		
		Random r = new Random();
		int num = r.nextInt(); //임의의 정수를 추출하는 메소드
		System.out.println("int범위의 임의의 정수: " + num);
		
		//0~9사이의 정수 추출
		int num2 = r.nextInt(10);
		System.out.println("0~9 사이 정수: " + num2);
		
		//1~100사이의 정수 추출
		
		int num3 = r.nextInt(100) + 1 ; //0~99  -> (100)+1 -> 1~100
		System.out.println("1~100사이 정수: " + num3);
		
	}

}
