package day08.abs01;

import java.util.Scanner;

public class Menu {

	public void process() {

		Scanner sc = new Scanner(System.in);
		System.out.println("프린터를 선택하세요(1. LG, 2.SAMSUNG) => ");
		int no = sc.nextInt();
		sc.nextLine();

		print(no);
	}
	

	public void print(int no) {
		switch (no) {
		case 1:
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case 2:
			
			SamsungPrinter ss = new SamsungPrinter();
			ss.print();
			break;
		}

	}
}
