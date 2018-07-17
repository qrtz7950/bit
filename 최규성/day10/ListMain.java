package day10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.ArrayList;
import java.util.List;

/*
 * List : 중복허용 순서있음
 * 구현 클래스 
 * 	-ArrayList
 * 	-LinkedList
 * 주요메소드
 *  -add :데이터 입력
 *  -addAll: 다른 List의 객체 입력
 *  -get: 데이터 추출
 *  -remove: 임의의 데이터 삭제
 *  -clear: 전체 데이터삭제
 *  -size: 전체 데이터 개수
 *  -contains: 데이터 검색
 *  -isEmpty: 배열이 비어있는지 체크
 *  -iterator: 이터레이터 객체를 반환
 */

public class ListMain {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");
		list.add("FIVE");
		
		System.out.println("< INDEX를 이용한 출력 >");
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("1.5버전의 for문을 아용한 출력");
		for(String str : list) {
			System.out.println(str);
		}
		
		/*		Iterator(순환자) 주요 메소드
		 * 		hasNext() : 데이터의 존재여부를 판단(true, false)
		 * 		next() :    데이터 얻기
		 */
		System.out.println("< iterator를 이용한 출력 >");
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("list 배열의 원소의 개수 : "+ list.size() +"개");
		list.add("One");
		System.out.println("\"one\" 추가후 원소의 개수 :" + list.size() +"개");
		
		System.out.println("1번지에 위치한 데이터: " + list.get(1));
		list.add(1,  "SIX");
		System.out.println("1번지에 위치한 데이터: " + list.get(1));
		
		int[] arr = new int[10];
		for(int i = 0; i<5;i++) {
			arr[i] =i+1;
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 4 ; i >=1; i--) {
			arr[i+1] = arr[i];
		}
		
		System.out.println(list.remove("SIX")? "삭제 성공" : "삭제실패");
		
		if(list.contains("SIX")) {
			System.out.println(" \"SIX\"문자열은 존재합니다.");
		} else {
			System.out.println(" \"SIX\"문자열은 존재하지않습니다.");
		}
		
		System.out.println("0번지 데이터 : " + list.get(0));
		System.out.println("삭제한 0번지 데이터:" + list.remove(0));
		System.out.println("0번지 데이터 : " + list.get(0));
		
		System.out.println("원소의 개수: "+ list.size());
		list.clear();
		System.out.println("원소의 개수: "+ list.size());

		if(list.isEmpty()) {
			System.out.println("배열이 비어있습니다.");
		} else {
			System.out.println("배열이 비어있지않습니다.");
		}
	}

}
