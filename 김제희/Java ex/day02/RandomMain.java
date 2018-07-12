package kr.co.mlec.day02;
import java.util.Random;

/*
 * Random class: 임의의 정수를 추출하는 기능하는 클래스
 * 사용하려는 Random class는 다른 패키지(package java.util;)에 있는 클래스이다 이를 사용하기 위해서 
 * import를 사용한다 import java.util.Random;를 입력하여 해당 패키지의 클래스를 사용할수 있도록한다
 * 
 * 
 */

public class RandomMain {

	public static void main(String[] args) {
		
		Random r = new Random(); //이건 기본으로 쓰는것
		//컨트롤 누르고 클래스에 마우스를 클릭 java\src를 연결
		
		int num = r.nextInt(); //임의의 정수를 추출하는 메소드
		System.out.printf("임의의 값 num: %d\n",num);
		
		// 0~9 사이의 정수를 추출하고싶다
		r.nextInt(10);
		//메소드 안에 매개변수 10을 넣으면 랜덤으로 추출된 값을 10으로 나눠 나오는 나머지 값 (0-9)
		
		num = r.nextInt(101); //0~100
		System.out.println("0~9사이의 임의의 값: "+ num);
		
		num = r.nextInt(100) + 1; //0+1~99+1 = 1~100
		System.out.println("1~100사이의 임의의 값: "+ num);
	}

}
