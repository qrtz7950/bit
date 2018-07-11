package kr.co.mlec.day07;

public class StringMain04 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		int searchIndex = str.indexOf('o');
		System.out.println(searchIndex);
		searchIndex = str.indexOf('p');
		System.out.println(searchIndex);
		
		searchIndex = str.indexOf("World");
		System.out.println(searchIndex);
		
		searchIndex = str.lastIndexOf('o');
		System.out.println(searchIndex);
		
		searchIndex = str.indexOf('o', 6);
		
		char c = 'l';
		for(int i=str.length(); i>=0; i--) {
			searchIndex = str.lastIndexOf(c, i);
			if(searchIndex != -1) {
				System.out.println(searchIndex);
				i = searchIndex;
			}
		}
	}

}
