package kr.co.mlec.day08.abs01;

import java.util.Scanner;

public class Menu {
	
	Scanner s = new Scanner(System.in);	
	
	public void process() {
		System.out.println("1. LG프린터 \t2.삼성프린터\t3.HP프린터");
		System.out.print("선택할 프린터 번호 입력 : ");
		int no = s.nextInt();
		
		print(no);
	}
	
	public void print(int no) {
		Printer p =  null;
		switch(no) {
		case 1:
			p = new LGPrinter();
			break;
		case 2:
			p = new SamsungPrinter();
			break;
		case 3 :
			p = new HPPrinter();
			break;
		default :
			System.out.println("넌 프린트할 자격이 없다...");
			return;
		}
		p.print();
	}
	
	/*
	public void print(int no) {
		switch(no) {
		case 1:
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case 2:
			SamsungPrinter samsung = new SamsungPrinter();
			samsung.print();
			break;
		case 3 :
			HPPrinter hp = new HPPrinter();
			hp.print();
			break;
		default :
			System.out.println("넌 프린트할 자격이 없다...");	
		}
	}
	*/
}
