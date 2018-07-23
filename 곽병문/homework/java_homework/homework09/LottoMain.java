package kr.co.mlec.homework.homework09;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		RandNum r = new RandNum();
		
		System.out.println("< Lotto program >");
		
		System.out.print("게임수를 입력하세요 : ");
		int gamen = Integer.parseInt(s.nextLine());
		
		for(int i=1; i<=gamen; i++) {
			System.out.print("게임" + i + " : ");
			r.rand(0);
			System.out.println();
		}
		
		
	}

}
