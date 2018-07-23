package kr.co.mlec.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 	Set : 중복x, 순서x
 * 	
 * 	구현 클래스
 * 		- HashSet
 * 		- TreeSet
 */

public class SetMain {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet</*String*/>();	// 1.7버전부터 생략가능
//		Set<String> set = new TreeSet</*String*/>();	// 순서 다르지만 유연하게 사용가능
		
		System.out.println("입력 전 데이터의 총개수 : " + set.size() + "개");
		
		System.out.println("\"one\" 데이터 입력 : " + set.add("one"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		System.out.println("\"one\" 데이터 입력 : " + set.add("one"));
		
		System.out.println("입력 후 데이터의 총개수 : " + set.size() + "개");
		
		/*
		 	Set 모든 데이터 출력하는 방법
		 	
		 	1. 1.5버전의 for문
		 	2. iterator() 이용
		 	3. toArray() 이용
		 */
		
		System.out.println("< 1.5 for >");
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println("=================================");
		
		System.out.println("< iterator >");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("=================================");
		
		
		System.out.println("< toArray() >");
		Object[] arr = set.toArray();
		for(Object o : arr) {
			String str = (String)o;
			System.out.println(o + ", length : " + str.length());
		}
	}

}
