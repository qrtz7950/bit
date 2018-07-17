package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;	//Map 클래스안에 Entry클래스가 포함되어있다.
import java.util.Scanner;
import java.util.Set;

/*
 * Map : Key, Value를 한쌍으로 데이터 저장 (순서 x, 키중복 x)
 * 구현클래스
 * 	-HashMap
 * 	-TreeMap
 * 주요메소드
 * 	-put(K,V)	:데이터 입력
 * 	-get(k) 	:해당 key의 value 추출
 * 	-remove(K) 	:해당 key의 데이터 삭제
 * 	-containsKey(k) 	:해당 key의 존재여부 파악
 * 	-entrySet()	 	:Map의 모든 데이터를 Map.Entry객체집합으로 반환
 * 	-keySet() 	:Map의 모든key를 Set객체로 변환
 * 
 */
public class MapMain {

	public static void main(String[] args) {

		Map<String, String> map  = new HashMap<>();
		
		map.put("aaa","1111");
		map.put("bbb","2222");
		map.put("ccc","3333");
		map.put("ddd","4444");
		
		//아이디가 'aaa'인 회원의 패스워드를 '1234'로 변경
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드 변경 서비스입니다");
		System.out.println("아이디를 입력하세요 : ");
		String id =  sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("입력하신 아이디[" + id + "] 는 존재하지않습니다.");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.println("현재 패스워드를 입력하세요: ");
		String password = sc.nextLine();
		
		if(!map.get(id).equals(password)) {
			System.out.println("입력하신 패스워드는 올바르지 않습니다");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.println("변경할 패스워드를 입력: ");
		String newPassword = sc.nextLine();
		
		map.put(id, newPassword);
		
		System.out.println("패스워드가 수정되었습니다.");
		
		System.out.println("< 회원목록 출력>");
		
		// 1	(순서가 맞게 나오지는 않는다)
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("아이디: " + key+ ", 패스워드: "+ map.get(key));
		}
		//  or 2	(aaa, bbb, ccc, ddd순으로 나옴)
/*
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> ite = set.iterator();
		
		
		while(ite.hasNext()) {
			Entry<String, String> data = ite.next();
			System.out.println("아이디:" + data.getKey()+ ", 패스워드: "+ data.getValue());
		} 혹은 밑의 for문
		
		
		for(Entry<String, String> data : set) {
			System.out.println("아이디:" + data.getKey()+ ", 패스워드: "+ data.getValue());
		}
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
