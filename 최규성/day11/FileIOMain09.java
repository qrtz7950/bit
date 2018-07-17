package kr.co.mlec.day11;

import java.util.ArrayList;
import java.util.List;

public class FileIOMain09 {

	public static void main(String[] args) {
		
		List<UserVO> list = new ArrayList<>();
		list.add(new UserVO("홍길동", "010-1111-2222", "서울시 서초구"));
		list.add(new UserVO("고길동", "010-3333-4444", "경기도 성남시 분당구"));
		list.add(new UserVO("최길동", "010-5555-6666", "서울시 강남구 압구정동"));
		
	}
}
