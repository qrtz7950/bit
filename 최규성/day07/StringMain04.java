package day07;

public class StringMain04 {

	public static void main(String[] args) {

		String str = "Hello World";

		int searchIndex = str.indexOf('o');
		System.out.println("앞에서 부터의\'o\'위치: " + searchIndex);

		int searchLastIndex = str.lastIndexOf('o');
		System.out.println("뒤에서 부터의 \'o\'위치: " + searchLastIndex);

		searchIndex = str.indexOf("World");
		System.out.println("\'World\'위치: " + searchIndex);

		str = "hello world";
		char ch = 'l';

		int index = str.indexOf(ch); // 찾은 문자가 있는 번지수의 정수값 저장
		while (index != -1) {
			System.out.println(ch + " 의 위치: " + index);
			index = str.indexOf(ch, index + 1);
		}
		System.out.println("----------------------");
		index = -1;
		while (true) {
			index = str.indexOf(ch, index + 1);
			if (index == -1) {
				break;
			}
			System.out.println(ch + " 의 위치: " + index);
		}
		
	}

}
