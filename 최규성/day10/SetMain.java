package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set : 중복 x, 순서 x
 * 	구현 클래스
 * 		-HashSet
 * 		-TreeSet
 */
public class SetMain {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();	//1.7부터는 오른쪽의 제너릭 안의 타입을 생략할수있다.
	
		System.out.println("입력전 데이터 개수: "+ set.size());
		
		boolean bool = set.add("ONE");
		System.out.println("\"ONE\" 데이터 입력: " + (bool ? "입력성공" : "입력실패"));
		set.add("ONE");
		set.add("TWO");
		set.add("THREE");
		set.add("FOUR");
		set.add("FIVE");
		
		bool = set.add("ONE"); //중복을 허용하지 않아 안됨
		System.out.println("\"ONE\" 데이터 입력: " + (bool ? "입력성공" : "입력실패"));
		
		System.out.println("입력후 데이터 개수: "+ set.size());
		
		/*
		 * Set의 모든 데이터를 출력하는 방법
		 * 1. 1.5버전의 for문
		 * 2. Iterator() 를 이용한 출력
		 * 3. toArray()를 이용한 출력 
		 */
	
		System.out.println("<1.5버전 for문>");
		for(String data : set) {
			System.out.println(data);
		}
	
		System.out.println("<iterator()를 이용>");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("<toArray()를 이용>");
		set.toArray();	//투어레이는 object 배열임
		Object[] arr = set.toArray();
		for(Object obj : arr) {
			String str = (String)obj;
			System.out.println(obj + ",length: "+ str.length());
		}
	
	}

}
