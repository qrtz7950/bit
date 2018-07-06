package kr.co.mlec.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		//정수를 저장하는 배열 iArr를 선언
		//정수나 실수값이 아닌 주소값을 가진 변수 이것을 참조변수라고한다.
		int[] iArr;
		//정수를 다섯개 저장하는 배열 성성
		iArr = new int[5];
		
		//참조변수[0]~참조변수[4]
		
		for(int i=0; i<5; i++) {
			iArr[i]= i;
		}
		for(int i=0; i<5; i++) {
			System.out.printf("iArr[%d]: %d\n", i, iArr[i]);
		}
		
		//////////////////////////////////
		
		
		//참조변수[0]~참조변수[size-1]
		int size = 5;
		iArr = new int[size];
		
		for(int i=0; i<size; i++) {
			iArr[i]= (i+1)*10;
		}
		for(int i=0; i<size; i++) {
			System.out.printf("iArr[%d]: %d\n", i, iArr[i]);
		}
		
		//배열의 원소가 몇개인지 쉽게 알수있게쓸수있음 
		//iArr.length
		//위의 코드에 size 대신 iArr.length를 써도 무방
		System.out.println("iArr배열 원소의 개수: " + iArr.length + "개");
		
		
	}

}
