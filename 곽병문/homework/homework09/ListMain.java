package kr.co.mlec.homework.homework09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		List<String> id = new ArrayList<String>();
		List<String> pw = new ArrayList<String>();
		
		id.add("aaa");
		pw.add("1111");
		id.add("bbb");
		pw.add("2222");
		id.add("ccc");
		pw.add("3333");
		
		System.out.println("패스워드 변경서비스입니다");
		System.out.print("아이디를 입력하세요 : ");
		String iid = s.nextLine();
		
		if(!id.contains(iid)) {
			System.out.println("입력하신 아이다[" + iid + "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String ppw = s.nextLine();
		String str = pw.get(id.indexOf(iid));

		if(!str.equals(ppw)) {
			System.out.println("입력하신 비밀번호가 틀렸습니다.");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("변경할 패스워드를 입력하세요 : ");
		ppw = s.nextLine();
		
		pw.remove(id.indexOf(iid));
		pw.add(id.indexOf(iid),ppw);
		System.out.println("패스워드가 수정되었습니다.");
		
		System.out.println("< 회원 목록 출력 >");
		
		for(int i=0; i<id.size(); i++) {
			System.out.println("ID : " + id.get(i) + ", PassWord : " + pw.get(i));			
		}
		
		s.close();
	}
}
