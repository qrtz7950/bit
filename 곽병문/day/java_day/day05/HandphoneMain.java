package kr.co.mlec.day05;

import java.util.Scanner;

public class HandphoneMain {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		Handphone khj = new Handphone();
		
		khj.name = "김희제";
		khj.number = "010-0823-0597";
		khj.company = "샘숭";
		
		Handphone csg = new Handphone();
		
		csg.name = "최성규";
		csg.number = "010-1934-7752";
		csg.company = "샘숭";
		
		System.out.println("소유주 : " + khj.name + ", 전화번호 : " + khj.number + ", 제조사 : " + khj.company);
		System.out.println("소유주 : " + csg.name + ", 전화번호 : " + csg.number + ", 제조사 : " + csg.company);
		
		Handphone numberBook[] = new Handphone[2];
		numberBook[0] = khj;
		numberBook[1] = csg;
		
		numberBook[0].call();
		numberBook[1].call();
		System.out.println("ㅠㅠ");
		
		for(int i=0; i<numberBook.length; i++) {
			System.out.println("소유주 : " + numberBook[i].name + ", 전화번호 : " + numberBook[i].number+ ", 제조사 : "+ numberBook[i].company);
		}
		
		for(Handphone phone : numberBook) {
			System.out.println("소유주 : " + phone.name + ", 전화번호 : " + phone.number+ ", 제조사 : "+ phone.company);
		}
		
		System.out.println("============================================================================");
		
		Handphone nB[] = new Handphone[2];
		for(int i =0; i<nB.length; i++) {
			nB[i] = new Handphone();
		}
		System.out.print("누구꺼? : ");
		nB[0].name = s.nextLine();
		System.out.print("전번? : ");
		nB[0].number = s.nextLine();
		System.out.print("제조사? : ");
		nB[0].company = s.nextLine();
		
		System.out.println(nB[0].name + ", " + nB[0].number + ", " + nB[0].company);
		
		s.close();
	}

}
