package kr.co.mlec.day06;
/*
 * String 생성자
 * 1. String()
 * 2. String(char[])
 * 3. String(char[], int, int)
 * 4. String(String)
 * 5. String(byte[])
 * 6. String(byte[], int, int)
 * 
 * 
 */
public class StingMain01 {

	public static void main(String[] args) {

		String str = new String();
		System.out.println("str : [" + str + "]");
		
		String str2 = null;
		System.out.println("str2 : [" + str2 + "]");
		
		System.out.println(str.length()); 		// 0
		//System.out.println(str2.length()); 	//가리키고있는 것이 없기때문에 메소드 호출 불가
		
		
		char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		str2 = new String(chars);
		
		System.out.println("str  : [" + str + "]");
		System.out.println("str2 : [" + str2 + "]");
		
		String str3 = new String(chars,2,3);
		System.out.println("str3 : [" + str3 + "]");
		//[cde]
		
		String str4 = new String("Hello");
		System.out.println("str4 : [" + str4 + "]");
		
		byte[] bytes = {65,66,67,68,69,70};
		String str5 = new String(bytes);
		System.out.println("str5 : [" + str5 + "]");
		// 지금까지 문자들의 집합을 문자열로 만듬
		
		//문자열을 문자로 만드는 메소드도 있다
		
	}

}
