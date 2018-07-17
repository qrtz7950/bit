package kr.co.mlec.day10;

import java.util.ArrayList;

/*
class MyArrayList<T> {

	private T[] values;
	
	public MyArrayList() {
		values = new T[10];
		//생성자에서 T자리에 자료타입을 써서 리스트를 생성함
	}
}
*/


public class GenericMain {

	public static void main(String[] args) {
			
		ArrayList list = new ArrayList();
		
		list.add(new String("hi"));
		list.add(new String("hello"));
		list.add(new Integer(12315));
		list.add(new Object());
		
		System.out.println((String)list.get(0));
		System.out.println((String)list.get(0));
		System.out.println((Integer)list.get(2));
		System.out.println((Object)list.get(3));
		//어떤 형이던 담음 수 있는 오브젝트형 리스트이지만 접근시 내가 어떤 형인지 명시해야하는 단점이있다
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list.add(new String("hi"));
		list.add(new String("hello"));
		//스트링형만 담을 수 있는 리스트
		
		
		
	}

}
