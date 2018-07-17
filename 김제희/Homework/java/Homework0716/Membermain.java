package kr.co.Homework0716;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Membermain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> idList = new ArrayList<String>();
		List<String> pwrdList = new ArrayList<String>();
		
		String id = null;
		String pwrd = null;
		
		System.out.println("추가해봅시다");
		System.out.print("몇명?: ");
		int cnt = sc.nextInt();
		sc.nextLine();
	
		for(int i = 0; i<cnt; i++) {
			System.out.print("input id: ");
			id = sc.nextLine();
			idList.add(id);
			System.out.print("input password: ");
			pwrd = sc.nextLine();
			pwrdList.add(pwrd);
		}
		
		for(int i = 0; i < idList.size(); i++) {
			System.out.print(i+1 + "번째 회원 id: " + idList.get(i));
			System.out.println("  password: " + pwrdList.get(i));
			}
		
		System.out.println("password를 바꿔봅시다");
		System.out.println("password를 바꾸고 싶은 id를 입력하세요: ");
		id = sc.nextLine();
		
		int changeNum = 0;
		
		if(!idList.contains(id)) {
			System.out.println(id + "라는 아이디 없습니다");
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		} else { 
			System.out.println(id +"의 비밀번호를 변경합니다");
			changeNum = idList.indexOf(id);
		}
		
		System.out.println("변경할 패스워드를 입력 : ");
		String newPwrd = sc.nextLine();
		
		pwrdList.remove(changeNum);
		pwrdList.add(changeNum,newPwrd);
		
		for(int i = 0; i < idList.size(); i++) {
			System.out.print(i+1 + "번째 회원 id: " + idList.get(i));
			System.out.println("  password: " + pwrdList.get(i));
		}
		
		
		
		
	}
}

