package kr.co.mlec.day08.abs01;

import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	public void process() {
		
		System.out.println("프린터 선택 \n 1. LG 프린터 \n 2. 삼성 프린터");
		System.out.print("번호를 선택하세요: ");
		
		int no = sc.nextInt();
		sc.nextLine();
		
		print(no);
		
	}
	
	public void print(int no) {
		
		switch (no) {
		case 1:
			LGPrinter lg =new LGPrinter();
			lg.print();
			break;
		case 2:
			SamsungPrinter sam =new SamsungPrinter();
			sam.print();
			break;
		default :
			System.out.println();
			
		}
		
	}
}
