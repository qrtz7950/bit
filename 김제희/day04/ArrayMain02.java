package kr.co.mlec.day04;

public class ArrayMain02 {

	public static void main(String[] args) {
		
		//청취 자바 교육 3개의 문자열을 저장하는 배열 strArr를 생성
/*		
		String[] strArr;
		strArr = new String[3];
*/
		//이것을 합쳐서 
		String[] strArr = new String[3];
		//라고 쓴다
		strArr[0] = "청취";
		strArr[1] = "자바";
		strArr[2] = "교육";
		
		for(int i = 0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		int[] iArr;
		iArr = new int[5];
		
	}

}
