package kr.co.mlec.day10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set : 중복  X , 순서 X
 * 구현 클래스ㅜ
 * - HashSet
 * - TreeSet
 * 
 */

public class SetMain {

	public static void main(String[] args) {
		
//	Set<String> set = new HashSet<>(); //1.7버젼부터 뒤에 생성되는 객체의 타입은 생성할수 있다.
	Set<String> set = new TreeSet<>();
	System.out.println("입력전 데이터의 총 개수: " + set.size());
	
	boolean bool = set.add("one");
	System.out.println("\"one\"데이터 입력 : " + (bool ? "입력성공" : "입력실패"));
	set.add("one");
	set.add("tow");
	set.add("three");
	set.add("four");
	set.add("five");
	
	System.out.println(set.add("one")); //add메소드는 리턴타입이 불린 이미 중복된 값이 있다면 false 반환
	bool = set.add("one");
	System.out.println("\"one\"데이터 입력 : " + (bool ? "입력성공" : "입력실패"));
	
	System.out.println("입력전 데이터의 총 개수: " + set.size());
	
	/*
	 * Set 모든 데이터를 출력하는 방법
	 * 1.1.5버젼 for each문
	 * 2.Iterator() 이용
	 * toArray() 이용
	 */
	System.out.println("----------------------------------------------------------------");
	//for each
	for(String str : set) {
		System.out.println(str);
	}
	
	System.out.println("----------------------------------------------------------------");
	//Iterator
	Iterator<String> ite = set.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	System.out.println("----------------------------------------------------------------");
	//ToAtrray 강제로 배열에 때려넣기
	Object [] arr = set.toArray();
	//배열로 만들었으니 배열을 출력하는 모든 방법 사용가능
	//for each
	for(Object obj : arr) {
		System.out.println(obj);
	}
		
	}

}
