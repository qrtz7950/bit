package kr.co.mlec.day02;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // System.out <-> System.in in은 키보드 입력
		//ctrl + shift + o = 자동 import
		
		System.out.print("문자를 입력: ");//문자하나만 입력받음
		char ch = sc.nextLine().charAt(0); //자바는 문자도 문자열처럼 입력받는다 명령어를 살짝 다르게쓰면된다
		System.out.println("ch = " + ch);
		
		System.out.print("문자열을 입력: ");
		//String str = sc.next(); //next는 공백문자(enter, tab, space)로 문자열 구분
		String str = sc.nextLine(); //nextLine은 엔터로 문자열을 구분하므로 공백이 포함된 문장 사용가능
		System.out.println("str = " + str);
		
		System.out.print("논리값을 입력: ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool = " + bool);
		
		System.out.print("실수 d 입력: ");
		double d = sc.nextDouble(); //메소드를 쓰는 형태는 외우자 
		System.out.println("d = " + d);
		
		System.out.print("정수 num 입력: ");
		int num = sc.nextInt(); //이건 외우자
		System.out.println("num = " + num);
		//이클립스 콘솔창에서 빨간색 네모가 프로그램이 아직 끝나지 않고 (브레이스를 만나지 않고) 실행중에 있다는 뜻
		//빨강 네모누르면 강제종료
		//이클립스가 콘솔창의 커서를 스마트하게 옮겨주지 못하니 마우스로 커서를 가져다 놓자
	}

}
