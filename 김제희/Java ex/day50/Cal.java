package kr.co.day50;

import java.util.Calendar;
import java.util.Scanner;

public class Cal {
	
	Calendar c = Calendar.getInstance();
	
	void print(int yearSel) {
		
		c.set(yearSel, 0, 1);
		
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);
		int a = day-1;
		
		for(int i = 0; i<=c.getActualMaximum(Calendar.MONTH); i++) {
			System.out.println(yearSel + "년 " + (++month) + "월");
			System.out.println("--------------------------------------------------------");
			System.out.println("일	 월	 화	 수	 목	 금	 토	");
			System.out.println("--------------------------------------------------------");
			for (int k = 1; k < day; k++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= c.getActualMaximum(Calendar.DATE); j++) {
				if (a >= 7) {
					System.out.println();
					a = 1;
				} else {
					a++;
				}
				System.out.print(j + "\t");
			}
			System.out.println();
			System.out.println("--------------------------------------------------------");
			c.set(yearSel, month, 1);
			day = c.get(Calendar.DAY_OF_WEEK);
			a = day - 1;
		}
		
	}

	void print(int yearSel, int MonSel) {
		
		c.set(yearSel, MonSel-1, 1);
			
			int day = c.get(Calendar.DAY_OF_WEEK);
			int a=day-1;
			System.out.println(yearSel + "년 " + MonSel + "월");
			System.out.println("--------------------------------------------------------");
			System.out.println("일	 월	 화	 수	 목	 금	 토	");
			System.out.println("--------------------------------------------------------");
			for (int k = 1; k < day; k++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= c.getActualMaximum(Calendar.DATE); j++) {
				if (a >= 7) {
					System.out.println();
					a = 1;
				} else {
					a++;
				}
				System.out.print(j + "\t");
			}
			System.out.println();
			System.out.println("--------------------------------------------------------");
		
	}
	
}
