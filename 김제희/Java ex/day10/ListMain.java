package kr.co.mlec.day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List 중복O 순서O
 * 중복과 순서를 모두 허용하는 리스트다
 * 
 * 구현 클래스
 * -ArrayList
 * -LinkedList
 * 
 * 주요메소드
 * -add 		: 데이터입력
 * -addAll 		: 다른 list의 객체입력
 * -get			: 데이터 추출
 * -remove		: 임의의 대이터 삭제
 * -clear 		: 전체 데이터 삭제
 * -size 		: 전체 데이터 개수
 * -contains 	: 데이터 존재유무
 * -isEmpyty		: 배열이 비어있는지 체크
 * -Iterator	: Iterator 객체를 반환
 */

public class ListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
//		List<String> list = new LinkedList<String>();
		
		list.add("힝힝");
		list.add("나만");
		list.add("에어콘");
		list.add("업서");
		list.add("ㅜㅜ");
		
		System.out.println("----------------------------------------------");
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("----------------------------------------------");
		System.out.println("for each문 이용 출력");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("----------------------------------------------");
		/*
		 * ----------------------------------------
		 *			Iterator(순환자) 주요 메소드 
		 * ----------------------------------------
		 * 		hasNext()	: 다음 데이터의 존재여부를 검사
		 *  	next()		: 데이터 얻기
		 * ----------------------------------------
		 * 
		 */
		
		System.out.println("<Iterator를 이용한 출력>");
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("list 배열의 원소의 개수: " + list.size());
		list.add("one");
		System.out.println("one 추가 후 원소의 개수 :" + list.size());
		
		System.out.println("1번지에 위치한 데이터: " + list.get(1));
		list.add(1, "히히!");
		System.out.println("1번지에 위치한 데이터: " + list.get(1));
		//add 메소드가 번지를 뒤로 밀면서 원하는 번지수에 저장해주는 일련의 동작들을 모두 수행해준다
		
		if(list.contains("히히!")) {
			System.out.println("히히!는 존재한다");
		} else {
			System.out.println("히히!는 존재하지않는다");
			
		}
		
		list.remove("히히!"); //반환형은 불린으로 지웟다 지우지못했다로 표시
		//매겨변수로 정수를 넣으면 인덱스위치의 값 지움
		
		if(list.contains("히히!")) {
			System.out.println("히히!는 존재한다");
		} else {
			System.out.println("히히!는 존재하지않는다");
			
		}
		System.out.println("0번지 데이터: " + list.get(0));
		System.out.println("삭제한 0번지 데이터: " + list.remove(0));
		System.out.println("바뀐 0번지 데이터: " + list.get(0));
		
		System.out.println("몇걔?: " + list.size());
		list.clear();
		System.out.println("몇걔?: " + list.size());
		//if문을 이용해서 쓸수있다.
		
		if(list.isEmpty()) {
			System.out.println("비었어");
		} else {
			System.out.println("있어");
			
		}
	
		
		
	}

}
