package kr.co.mlec.homework.homework10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BoardServer {	
	static private List<Form> list = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	
	public void showAll() {
		Iterator<Form> ite = list.iterator();
		if(!ite.hasNext()) {
			System.out.println("저장된 게시글 목록이 없습니다");
		}
		System.out.println("번호\t글쓴이\t등록일\t\t제목");
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
	
	public void showNum() {
		System.out.print("조회할 글번호를 입력 : ");
		int num = Integer.parseInt(s.nextLine());
		int num2=-1;
		if(num<1 || num>list.size()) {
			System.out.println("조회할 글번호 " + num + "은 존재하지 않습니다");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNum()==num) {
				num2=i;
				break;
			}
		}
		if(num2==-1) {
			System.out.println("조회할 글번호 " + num + "은 존재하지 않습니다");
			return;
		}
		System.out.println();
		System.out.println("번   호 : " +  list.get(num2).getNum());
		System.out.println("제   목 : " +  list.get(num2).getTitle());
		System.out.println("글쓴이 : " +  list.get(num2).getWriter());
		System.out.println("등록일 : " +  list.get(num2).getDay());
	}
	
	public void upload() {
		System.out.print("등록할 제목을 입력하세요 => ");
		String title = s.nextLine();
		System.out.print("등록할 글쓴이를 입력하세요 => ");
		String writer = s.nextLine();
		Form tmp = new Form(title, writer);
		list.add(tmp);
	}
	
	public void modify() {
		System.out.print("수정할 글번호를 입력 => ");
		int num = Integer.parseInt(s.nextLine());
		int num2=-1;
		if(num<1 || num>list.size()) {
			System.out.println("수정할 글번호 " + num + "은 존재하지 않습니다");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNum()==num) {
				num2=i;
				break;
			}
		}
		if(num2==-1) {
			System.out.println("수정할 글번호 " + num + "은 존재하지 않습니다");
			return;
		}
		System.out.print("바꿀 제목을 입력 => ");
		String title = s.nextLine();
		Form tmp = new Form(title, list.get(num2).getWriter(), num);
		list.add(num2,tmp);
		list.remove(num2+1);
		System.out.println("제목이 수정되었습니다");
	}
	
	public void remov() {
		System.out.println("삭제할 글 번호를 입력 => ");
		int num = Integer.parseInt(s.nextLine());
		int num2=-1;
		if(num<1 || num>list.size()) {
			System.out.println("삭제할 글번호 " + num + "은 존재하지 않습니다");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNum()==num) {
				num2=i;
				break;
			}
		}
		if(num2==-1) {
			System.out.println("삭제할 글번호 " + num + "은 존재하지 않습니다");
			return;
		}
		list.remove(num2);
		System.out.println((num2+1) + "번 글이 삭제 되었습니다");
	}
	
}
