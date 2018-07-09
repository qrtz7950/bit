package day04;

public class ArrayMain01 {

	public static void main(String[] args) {

		int[] iArr = new int[5]; //iArr은 참조변수
		
		System.out.println("iArr: " + iArr); //출력결과 iArr: [I@7852e922
		System.out.println("iArr배열 원소의 개수: "+ iArr.length + "개");
		
		
		System.out.println(iArr[0]); //출력결과 0 (배열이만들어지면서 초기화값 0이들어감)
		System.out.println(iArr[1]);
		System.out.println(iArr[2]);
		System.out.println(iArr[3]);
		System.out.println(iArr[4]);
		
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		iArr[3] = 40;
		iArr[4] = 50;
		
		for(int i = 0; i <iArr.length;i++) {
			iArr[i] = (i+1) * 10;
		}
		
		for(int i = 0; i <5 ; i++) {
			System.out.print(iArr[i]+" ");
		}
		
		System.out.println();
	}

}
