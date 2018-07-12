package kr.co.mlec.day07;

public class StringMain04 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		int searchIndex = str.indexOf('o');
		System.out.println("\'o\'위치 : " + searchIndex);
		
		searchIndex = str.indexOf('o', 6);
		System.out.println("\'o\'위치 : " + searchIndex);
		
		searchIndex = str.indexOf('p');
		System.out.println("\'p\'위치 : " + searchIndex);
		
		searchIndex = str.indexOf("World");
		System.out.println("\"world\"위치 : " + searchIndex);
		
		searchIndex = str.lastIndexOf('o');
		System.out.println("\'o\' 마지막 위치 : " + searchIndex);
		
		str = "hello world";
		char ch = 'l';
		
		System.out.println("-----------------------------------------");
		int index = str.indexOf(ch);
		while (index != -1) {
			System.out.println("마지막에 있는" + ch + "위치: " + index);
			index = str.indexOf(ch,index+1);
		}
		//indexOf는 문자열에서 문자 하나의 위치만을 찾는 메소드이지만 이렇게 활용하면다 찾을수도 잇다
		System.out.println("-----------------------------------");
		index = -1;
		while(true) {
			index = str.indexOf(ch, index+1);
			if(index == -1) {
				break;
			}
			System.out.println(ch + " 위치 : " + index);
		}
		// 239가 나오는데 932가 나오게 바꿔보다
		
		
		
		
		
	}
}






