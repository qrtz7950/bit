package kr.co.mlec.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
	Map : Key, Value를 한쌍으로 데이터 저장   순서X, 키중복X
	 구현클래스
	  - HashMap
	  - TreeMap
	 주요메소드
	  - put(K, V)		: 데이터 입력
	  - get(K)			: 해당 key의 value 추출
	  - remove(K)		: 해당 key의 데이터 삭제
	  - containsKey(K)	: 해당 key 존재여부 파악
	  - entrySet()		: Map의 모든 데이터를 Map.Entry객체집합으로 반환
	  - keySet()		: Map의 모든 key를 Set객체로 변환
*/


public class MapMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		//아이디가 "aaa"인 회원의 패스워드를 "1234" 변경
		
		System.out.println("바꿔드림");
		System.out.println("아디뭐임여기치셈: ");
		String id = sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println(id + "라는 아이디 없는데");
			System.out.println("ㅂㅂ");
			System.exit(0);
		} else { 
			
		}
			
		System.out.println("느그아디 비번입력: ");
		String password = sc.nextLine();
		if(!map.get(id).equals(password)) {
			System.out.println("입력하신 패스워드는 올바르지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.println("변경할 패스워드를 입력 : ");
		String newPassword = sc.nextLine();
		
		map.put(id, newPassword);
		
		System.out.println("패스워드가 수정되었습니다");
		System.out.println("----------------------------------------------------------------");
		System.out.println("회원목록출력");
		//System.out.println(map.entrySet());
		Set<Entry<String, String>> set = map.entrySet();
		
		/*
		Iterator<Entry<String, String>> ite = set.iterator();
		while(ite.hasNext()) {
			Entry<String, String> data = ite.next();
			System.out.println("아이디 : " + data.getKey() + ", 패스워드 : "  + data.getValue());
		}
		*/
		
		for(Entry<String, String>  data: set) {
			System.out.println("아이디 : " + data.getKey() + ", 패스워드 : "  + data.getValue());
		}
		
		//key만 뽑아낼때 사용하는게 keyset
		
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println("아이디: " + key + ", 패스워드: " + map.get(key));
		}	
		
	}

}
