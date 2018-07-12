package kr.co.mlec.day06;

import java.util.Scanner;

public class Gugudan {

	Scanner s = new Scanner(System.in);
	
	int getDan() {
			
			int a = s.nextInt();
			s.nextLine();

			
			return a; 
		}
	
	int getDan(String str) {
		
		System.out.print(str);
		
		int a;
		
		a = getDan();
		
		return a; 
	}
	
	void pr(int a) {
		if(a>9 || a<2) {
			System.out.println("이해 못함??");
		}
		else {
			System.out.println("*** " + a + "단 ***");
			for(int i=1; i<=9; i++) {
				System.out.println(a + " * " + i + " = " + (a*i));
			}
		}
	}
	
	// 2~9단 출력
	void pr() {
		for(int a=2; a<=9; a++) {
			pr(a);
		}
	}

	void pr(int startDan, int endDan) {
		int temp;
		if(startDan>endDan) {
			temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
		for(int a = startDan; a<=endDan; a++) {
			pr(a);
		}
	}
	
}
