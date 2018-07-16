package kr.co.mlec.day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 	List : 중복O, 순서O
 * 
 * 	구현클래스
 * 		- ArrayList
 * 		- LinkedList
 * 
 * 	주요메소드
 * 		- add		: 데이터 입력
 * 		- addAll	: 다른 List의 객체 입력
 * 		- get		: 데이터 추출
 * 		- remove	: 임의의 데이터 삭제
 * 		- clear		: 전체 데이터 삭제
 * 		- size		: 전체 데이터 개수
 * 		- contains	: 데이터 존재유무
 * 		- isEmpty	: 배열이 비어있는지 체크
 * 		- Iterator	: iterator객체를 반환
 */
public class ListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
//		List<String> list = new LinkedList<String>();	// List로 선언하여 유연하게 사용
		
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");
		list.add("FIVE");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
		/*
		 	------------------------------------------------------------
		 		Iterator(순환자) 주요 메소드
		 	------------------------------------------------------------
		 		hasNext()	: 다음 데이터의 유무, 데이터 존재여부 판단 (boolean)
		 		next()		: 데이터 얻기
		 	------------------------------------------------------------
		 */
		
		System.out.println("< iterator를 이용한 출력 >");
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("list 배열의 원소의 개수 : " + list.size() + "개");
		list.add("one");
		System.out.println("\"one\" 추가후 원소의 개수 : " + list.size() + "개");
		
		System.out.println("1번지으ㅔ 위차한 데이터 : " + list.get(1));
		list.add(1, "SIX");
		System.out.println("1번지으ㅔ 위차한 데이터 : " + list.get(1));
		
		if(list.contains("SIX")) {
			System.out.println("\"SIX\" 존재");
		}else {
			System.out.println("\"SIX\" 없다");
		}
		
		System.out.println(list.remove("SIX")?"삭제성공":"삭제실패");
		
		if(list.contains("SIX")) {
			System.out.println("\"SIX\" 존재");
		}else {
			System.out.println("\"SIX\" 없다");
		}
		
		System.out.println("0번지 데이터 : " + list.get(0));
		System.out.println("삭제한 0번지 데이터 :" + list.remove(0));
		System.out.println("0번지 데이터 : " + list.get(0));
		
		System.out.println("원소의 개수 : " + list.size() + "개");
		list.clear();
		System.out.println("원소의 개수 : " + list.size() + "개");
		
		if(list.isEmpty()) {
			System.out.println("배열 비었다");
		}
	}

}
