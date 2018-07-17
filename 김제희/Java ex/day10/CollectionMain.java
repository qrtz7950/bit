package kr.co.mlec.day10;

/*
 * boolean 		Bloolean
 * char			Char
 * byte			Byte
 * short		Short
 * int			Integer
 * long			Long
 * 
 */

public class CollectionMain {

	public static void main(String[] args) {
			
		int num = 10;
		Integer i = new Integer(10);
		
		System.out.println("num: " + num);
		System.out.println("i: " + i);
		
		num = new Integer(100);
		i=120;
				
		System.out.println("num: " + num);
		System.out.println("i: " + i);
		
		String str = "1234";
		
		System.out.println(Integer.parseInt(str));
		System.out.println(Integer.valueOf(str));
		
		System.out.println(Integer.parseInt(str)+Integer.valueOf(str));
//		parseInt는 인티저형으로 valueOf는 참조자료형으로 반환한다 하지만 뭘써도 무방 
		System.out.println();
		
		
		
	}

}
