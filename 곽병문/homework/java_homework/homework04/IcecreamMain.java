package kr.co.mlec.homework.homework04;

import java.util.Scanner;

/*
 *	입력, 정리	
 *
 * 	*** 1번째 아이스크림 정보 입력 ***
 * 	아이스크림명 : (입력)
 * 	아이스크림가격 : (입력)
 * 
 * 	...
 * 
 * 	*** 4번째
 * 
 * 	<아이스크림 구매 정보>
 * 	번호	아이스크림명	아이스크림가격
 * 	1	
 * 	2
 * 	3
 * 	4
 */

public class IcecreamMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("아이스크림 몇개 구입할래? => ");
		int n = s.nextInt();
		
		Icecream[] ice = new Icecream[n];
		
		for(int i=0; i<ice.length; i++) {
			ice[i] = new Icecream();
			System.out.print("*** " + (i+1) + "번째 아이스크림 정보 입력 ***\n아이스크림명 : ");
			ice[i].name = s.next();
			s.nextLine();
			System.out.print("아이스크림가격 : ");
			ice[i].price = s.nextInt();	// Integer.parseInt(s.nextLine());
			s.nextLine();
			System.out.println();
		}
		
		System.out.println("< 아이스크림 구매 정보 >\n번호\t아이스크림명\t아이스크림가격");
		for(int i=0; i<ice.length; i++) {
			System.out.printf("%d\t%s\t\t%d원\n", i+1, ice[i].name, ice[i].price);
		}
		
		
		s.close();
	}

}

class Icecream {
	String name;
	int price;
}
