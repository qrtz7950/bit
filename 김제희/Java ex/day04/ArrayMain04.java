package kr.co.mlec.day04;

import java.util.Arrays;

/*
 * 자바에서 제공하는 배열관련 API
 */
public class ArrayMain04 {

	public static void main(String[] args) {

		int [] n = {10,20,30,40,50};
		int [] n2;		
		
		//n2도 5개의 정수값을 가리키는 주소값을 가지게 하고싶다?
		n2 = n;
		//shallow copy(얕은 복사) : 원본은 하나고 참조변수만을 복사하는것
				
		//주소값만 복사하는게 아니라 num이 가지는 값까지도 복사하고싶다?
		//deep copy(깊은 복사): 원본의 내용도 복사하는 것
		n2 = new int[n.length];
		
		for(int i = 0; i<n.length; i++) {
			n2[i] = n[n.length-i-1];
		}
		
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(n2));
		System.out.println("\n");
		
		// 포문 돌리기 귀찮으면 메소드도 하나 있다
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//System.arraycopy(원본배열명, 시작위치, 복사할 배열명, 시작위치, 복사할 개수);
		
		System.arraycopy(n2,0,n,0,n2.length);
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(n2));
		
		System.out.println("\n");
		
		//매개변수 활용
		
		System.arraycopy(n,1,n2,3,2);
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(n2));
		
		
		
	}

}
