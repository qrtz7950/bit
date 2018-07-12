package kr.co.mlec.day04;

public class ArrayMain01 {
	public static void main(String[] arg) {
		
		int[] iArr;
		iArr = new int[5];
		System.out.println("iArr : " + iArr);
		
		for(int i=0; i<5; i++) {
			iArr[i] = (i+1)*10;
			System.out.println("iArr["+i+"] : " +iArr[i]);
		}
		
		System.out.println("iArr배열 원소의 개수 : " + iArr.length);
		
	}
}
