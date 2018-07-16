package kr.co.mlec.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 	Map
 
 	- 구현 클래스 : HashMap
				
				TreeMap

		.put(K key, V value)			: 데이터 입력	// 동일한 값이 있을 경우 새로운 값으로 대체하고 기존 값 반환
		.get(Object Key)				: 데이터 추출	// Key에 해당하는 값이 없을 경우 null 반환
		.remove(Object Key)				: 데이터 삭제	// 삭제된 값을 리턴, Key에 해당하는 값이 없을 경우 null 반환
		.containsKey(Object Key)		: 특정키 확인	// Key 가 존재할 경우 true 반환
		.putAll(Map<K Key, V value>m)	: 콜렉션 추가
		.entrySet()						: (key와 value) 쌍을 표현하는 Map.Entry 집합을 반환
 */

public class MapMain {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		// 아이디가 "aaa"인 회원의 패스워드를 '1234' 변경
		Scanner s = new Scanner(System.in);
		System.out.println("패스워드 변경서비스입니다");
		System.out.print("아이디를 입력하세요 : ");
		String id = s.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("입력하신 아이다[" + id + "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String pw = s.nextLine();
		
		if(!map.get(id).equals(pw)) {
			System.out.println("입력하신 비밀번호가 틀렸습니다.");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("변경할 패스워드를 입력하세요 : ");
		pw = s.nextLine();
		
		map.put(id, pw);
		System.out.print("패스워드가 수정되었습니다.");
		
		System.out.println("< 회원 목록 출력 >");
		Set<Entry<String, String>> set = map.entrySet();
		
		Iterator<Entry<String, String>> ite = set.iterator();
		while(ite.hasNext()) {
			Entry<String, String> data = ite.next();
			System.out.println("ID : " + data.getKey() + ", PassWord : " + data.getValue());
		}
		
		for(Entry<String, String> data2 : set) {
			System.out.println("ID : " + data2.getKey() + ", PassWord : " + data2.getValue());			
		}
	}

}
