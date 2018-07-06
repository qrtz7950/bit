package kr.co.mlec.day04;

import java.util.Arrays;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		//만들 때 부터 값을 가지는 배열을 만들어보자
		
		int [] Arr = {1,2,3};
		String [] strArr = {"곽병문","김제희","최규성"};
		String [] strArr2 = new String[]{"곽병문","김제희","최규성"};
		
		// 다 같은 방식이지만 조금 기능이 다름
		
		//10,20,30,40,50의 값ㄷ을 가지는 배열을 생성
		
		int [] iArr = {10,20,30,40,50};
	
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i] + "  ");
		}
		System.out.println();
		
		// 100 200 300 400 500 600 700 의 값을 가지는 배열을 만들어보자
		//iArr가 지금 값 5개를 가지는 배열이 아닌 다른 배열을 가리키도록 만들어보자
		//int [] iArr = {10,20,30,40,50};을 초기화할때
		//iArr = {100,200,300,400,500,600,700}; 은 에러난다
		//해당 방법은 배열을 선언할 때만 사용할 수 있다
		//iArr = new int[] {100,200,300,400,500,600,700};은 사용 가능
		//첫번째로 초기화할때는 전자의 방법 두번째로 초기화할때는 후자의 방법을 더 많이 사용한다
		
		int [] iArr2 = {100,200,300,400,500,600,700};
		
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr2[i] + "  ");
		}
		System.out.print("\n\n");
		
		System.out.println("JDK 1.5의 for문을 이용한 출력");
		for(String str : strArr) {
			System.out.print(str + "  ");
		}
		// 곽병문  김제희  최규성
		System.out.print("\n\n");
		
		System.out.println("Arrays.toString()를 이용한 배열 출력");
		System.out.println(Arrays.toString(strArr));
		// [곽병문, 김제희, 최규성]
		
	}

}
