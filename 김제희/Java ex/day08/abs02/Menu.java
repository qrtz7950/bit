package kr.co.mlec.day08.abs02;

import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	public void process() {
		
		System.out.println("프린터 선택 \n 1. LG 프린터 \n 2. 삼성 프린터 \n 3. HP 프린터");
		System.out.print("번호를 선택하세요: ");
		
		int no = sc.nextInt();
		sc.nextLine();
		
		print(no);
		
	}
	
	public void print(int no) {
		
		Printer p = null;
		
		switch (no) {
		case 1:
			p =new LGPrinter();
			p.print();
			break;
		case 2:
			p =new SamsungPrinter();
			p.print();
			break;
		case 3:
			p =new HPPrinter();
			p.print();
			break;
		default :
			System.out.println("아니 똑바로 안하냐");
			return;
		}
		
	}
}
