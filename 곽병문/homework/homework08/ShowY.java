package kr.co.mlec.homework.homework08;

import java.util.Calendar;

public class ShowY extends Show {

	@Override
	public void showCalendar() {
		
		for(int i=1; i<=12; i++) {
			c.set(year, i-1, 1);
			max_day = c.getActualMaximum(c.DAY_OF_MONTH);
			dayOfWeek = c.get(c.DAY_OF_WEEK);
			
			System.out.println(year + "년 " + i + "월");
			System.out.println("--------------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("--------------------------------------------------------");
			for(int j=1; j<max_day+dayOfWeek; j++) {
				if(j<dayOfWeek) {
					System.out.print(" \t");
				}else {
					System.out.print((j-dayOfWeek+1) + "\t");
				}
				if(j%7==0) {System.out.println();}
			}
			System.out.println();
			System.out.println();
		}
	}

}
