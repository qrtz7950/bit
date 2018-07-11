package day06;

public class StringMain03 {

	public static void main(String[] args) {

		String str = new String("Hello");
		// String str = "Hello";
		String str2 = new String("Hello");
		// String str2 = "Hello";

		if (str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}

		// 문자열 내용 비교
		str = new String("HELLO");
		str2 = new String("hello");

		// boolean bool = str.equals(str2); // str과 str2가 같은 문자열비교
		boolean bool = str.equalsIgnoreCase(str2); // 대소문자 무시하고 문자열 비교
		if (bool) {
			System.out.println("같은 문자열입니다");
		} else {
			System.out.println("다른 문자열입니다");
		}

		str = new String("Hello");
		bool = str.startsWith("He");
		if (bool) {
			System.out.println("[" + str + "]은 \"He\"로 시작합니다");
		} else {
			System.out.println("[" + str + "]은 \"He\"로 시작하지않습니다");
		}

		str = "hello.txt";
		bool = str.endsWith(".txt");
		System.out.println("[" + str + "]은 " + (bool ? "텍스트파일입니다" : "텍스트 파일이 아닙니다"));

		str = "apple";
		str2 = "banana";
		int compare = str.compareTo(str2);
		if (compare == 0) {
			System.out.println(str + "==" + str2);
		} else if (compare > 0) {
			System.out.println(str + ">" + str2);
		} else { // compare < 0
			System.out.println(str + "<" + str2);
		}

		String[] names = { "홍길동", "강길동", "홍길순", "박수홍", "홍길동", "박홍동" };

		System.out.println("< 이름이 홍길동인 사람 목록 조회 >");
		for (String name : names) {
			if (name.equals("홍길동"));{ // = if("홍길동".equals(name));
				System.out.println(name);
			}
		}
		
		System.out.println("< 성이 홍씨인 사람 조회 >");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		System.out.println("< 이름이 길동인 사람 조회 >");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
				
			}
		}
		
		System.out.println("< 홍을 가지고 있는 사람 조회 >");
		for(String name : names) {
			if(name.contains("홍")){
				System.out.println(name);
			}
		}
	}

}
