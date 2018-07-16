package kr.co.mlec.day10;

import java.util.ArrayList;


public class GenericMain {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new String("hello"));
		list.add(new Integer(123));
		list.add(new Object());
		
		System.out.println((String)list.get(0));
		System.out.println((Integer)list.get(1));
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add(new String("bye"));
//		list2.addAll(Integer(321));		// Generic이 String이여서 오류

	}

}
