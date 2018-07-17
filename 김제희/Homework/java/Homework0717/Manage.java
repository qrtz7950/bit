package kr.co.Homework0717;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Manage {
	
	Scanner sc = new Scanner(System.in);
    static int num = 1;
    static List<Object> list = new ArrayList<Object>();
    
	public void manage(int selMenu) {
		
		switch (selMenu) {
		case 1:
			if(list.size() == 0) {
				System.out.println("저장된 게시글 목록이 없습니다");
				break;
			}
			viewAllPost();
			break;
		case 2:
			System.out.print("조회할 글 번호를 선택하세요: ");
			int selNum = sc.nextInt();
			sc.nextLine();
			viewPost(selNum);
			break;
		case 3:
			
			list.add(write());
			break;
		case 4:
			System.out.print("수정할 글 번호를 선택하세요: ");
			selNum = sc.nextInt();
			sc.nextLine();
			correct(selNum);
			break;
		case 5:
			System.out.print("삭제할 글 번호를 선택하세요: ");
			selNum = sc.nextInt();
			sc.nextLine();
			del(selNum);
			break;
		case 0:
			System.out.println("ㅂㅂ");
			System.exit(0);
			break;
		default:
			System.out.println("잘못된 번호입니다 1-5사이의 번호를 다시 입력하세요");
			break;
		}
		
	}

	private void viewAllPost() {
		
		System.out.println("번호	글쓴이	등록일		제목");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

	private void viewPost(int selNum) {

		Post p = null;
		
		try {
			p =(Post) list.get(selNum-1);
		} catch (Exception e) {
			
		}
		
		if(selNum == 0 || p==null) {
			System.out.println("조회할 글 번호 "+ selNum  +"는 존재하지 않습니다");
		} else {
			System.out.println("번   호: " + p.getNum());
			System.out.println("제   목: " + p.getTitle());
			System.out.println("글쓴이: " + p.getAuthor());
			System.out.println("등록일: " + p.getDay());
		}
		
	}

	private Post write() {
		
		System.out.print("등록할 제목을 입력하세요");
		String title = sc.nextLine();
		System.out.print("등록할 글쓴이을 입력하세요");
		String author = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String day = sdf.format(new Date());
		
		Post p = new Post(num, author, day, title);
		num++;
		
		return p;
	}
	
private Post write(int selNum) {
		
		System.out.print("등록할 제목을 입력하세요: ");
		String title = sc.nextLine();
		System.out.print("등록할 글쓴이을 입력하세요:");
		String author = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String day = sdf.format(new Date());
		
		Post p = new Post(selNum, author, day, title);
		
		return p;
	}

	private void correct(int selNum) {

		list.add(selNum,write(selNum));
		
		del(selNum);
		num--;
	}

	private void del(int selNum) {
		list.remove(selNum-1);
		System.out.println("삭제되었습니다");
	}



}
