package kr.co.mlec.day06;

/*
 * String 생성자
 * 
 * 1. String()
 * 2. String(char[])
 * 3. String(char[], int, int)
 * 4. String(String)
 * 5. String(byte[])
 * 6. String(byte[], int, int)
 */

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String();
		printStr(str);
		
		//	String str2 = null;
		
		System.out.println(str.length());
		// System.out.println(str2,length());	// 인스턴스 객체 없어서(가르키는 주소x) 
												// .length 사용불가
		char[] cs = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		String str2 = new String(cs);		// char 배열 내용 합쳐서 String으로 만드는 생성자
		printStr(str2);
		
		String str3 = new String(cs, 2, 4);	//char배열 char[a]부터 b개를 String으로 변환하여 반환
		printStr(str3);
		
		byte[] bs = {65, 66, 67, 68, 69, 70};
		
		String str4 = new String(bs);
		printStr(str4);
		
	}
	
	static void printStr(String str) {
		System.out.println("str : [" + str + "]");
	}

}
