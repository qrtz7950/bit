package kr.co.mlec.day06;

public class StringMain03 {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println("문자열 주소 비교");
		if(str == str2) {
			System.out.println("str == str2");
		}else {
			System.out.println("str != str2");
		}
		
//----------------------------------------------------------------
		System.out.println("문자열 내용 비교");
		if(str.equals(str2)) {
			System.out.println("같은 문자열이다ㅏ");
		}else {
			System.out.println("같은 문자열이 아닌것이 아닌것이 아니다ㅏ");
		}
		
//----------------------------------------------------------------
		System.out.println("대소문자 상관 ㄴ");
		str = new String("HELLO");
		str2 = new String("hello");
		
		if(str.equalsIgnoreCase(str2)) {
			System.out.println("같은 문자열이다ㅏ");
		}else {
			System.out.println("같은 문자열이 아닌것이 아닌것이 아니다ㅏ");
		}

//----------------------------------------------------------------
		str = new String("Hello");
		boolean bool = str.startsWith("He");
		if(bool) {
			System.out.println(str +"로 시작한다더라");
		}else {
			System.out.println(str +"로 시작안한다더라");
		}
		
//----------------------------------------------------------------
		str = new String("Hello.txt");
		bool = str.endsWith(".txt");
		if(bool) {
			System.out.println(str +"텍스트 파일이더라");
		}else {
			System.out.println(str +"텍스트 파일이 아니다더라");
		}
		
//----------------------------------------------------------------
		str = "apple";
		str2 = "banana";
		
		int compare = str.compareTo(str2);
		if(compare == 0) {
			System.out.println(str+" == "+str2);
		}else if(compare > 0) {
			System.out.println(str+" > "+str2);
		}else {
			System.out.println(str+" < "+str2);
		}
//----------------------------------------------------------------
		String[] names = {"홍길동", "강길동", "홍길순", "박수홍", "홍길동", "박길동"};
		
		System.out.println("이름이 홍길동인 사람 목록 조회 >");
		
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		
//----------------------------------------------------------------
		System.out.println("성이 홍씨인 사람 조회 >");
		
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
//-----------------------------------------------------------------
		System.out.println("이름에 홍 들어간 사람 조회 >");
		
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		
	}	
}
