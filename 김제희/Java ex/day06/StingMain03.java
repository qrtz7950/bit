package kr.co.mlec.day06;

public class StingMain03 {

	public static void main(String[] args) {

		String str = "Hello";
		String str2 = "Hello";
		
		System.out.println("문자열 주소 비교");
		if(str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		//이건 주소 값 비교기 때문에 같다고 나온다 stack에 있는 같은 hello를 가리키는 주소값을 가지고있다
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		if(str3 == str4) {
			System.out.println("str3 == str4");
		} else {
			System.out.println("str3 != str4");
		}	
		
		//주소값이 다르다
		System.out.println();
		//주소값이 아니라 문자열 내용 비교를 해보자
		
		boolean bool = str.equals(str2);
		
		System.out.println("문자열 내용 비교");
		if(bool) {
			System.out.println("같은 문자열");
		} else {
			System.out.println("다른 문자열");
		}
		//주소값이 아니라 내용을 비교한다
		//ㄹㅇ루 같은 문자다
		
		System.out.println();
		
		//대소문자를 무시하고 비교해보자
		String str5 = "Hello";
		String str6 = "hello";
		
		boolean bool2 = str.equalsIgnoreCase(str2);
		
		System.out.println("대소문자를 무시한 문자열 내용 비교");
		if(bool2) {
			System.out.println("같은 문자열");
		} else {
			System.out.println("다른 문자열");
		}
		
		System.out.println("시작하는 문자가 같을까요?");
		String str7 = new String("Hello");
		boolean bool3 = str.startsWith("He");
		if(bool3) {
			System.out.println(str + "은 He로 시작합니다");
		} else {
			System.out.println(str + "은 He로 로 시작하지않습니다");
		}
		
		System.out.println("끝나는 문자가 같을까요?");
		str7 = "Hello.txt";
		boolean bool4=str.endsWith(".txt");
		System.out.println(str7 + "은" + (bool?"텍스트 파일입니다":"텍스트파일이 아닙니다"));
		
		System.out.println("어떤 문자가 더 클까요?(사전적으로 뒤로 오는 문자가 뭘까요)");
		str = "apple";
		str2 = "banana";
		int compare = str.compareTo(str2);
		if(compare == 0) {
			System.out.println(str + " == " +str2);
		} else if (compare > 0) {
			System.out.println(str + " > " +str2);
		} else {
			System.out.println(str + " < " +str2);
		}
		
		System.out.println();
		String [] names = {"김제희", "곽병문", "곽병문", "곽병문", "곽병문", "최규성"};
		System.out.println("이름이 곽병문인 사람 목록조회");
		
		for(String name : names) {
			if(name.equals("곽병문")) {
				System.out.println(name);
			}
		}
		
		System.out.println("이름이 김으로 시작하는 사람 출력");
		for(String name : names) {
			if(name.startsWith("김")) {
				System.out.println(name);
			}
		}
		
		System.out.println("이름이 제희인 사람 조회 ");
		for(String name : names) {
			if(name.endsWith("제희")) {
				System.out.println(name);
			}
		}
		
		System.out.println("곽을 가지고 있는 사람 조회 ");
		for(String name : names) {
			if(name.contains("곽")) {
				System.out.println(name);
			}
		}
	}

}
