package day09Hw;

import java.util.Calendar;

public class CalendarUtil {
	
	public void showDayByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			showDayByMonth(year, month);
		}
	}
	
	public void showDayByMonth(int year, int month) {
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		
		//특정년도, 특정월의 1일이 무슨요일인지 알아야함.
		int week = c.get(Calendar.DAY_OF_WEEK);
		//특정월의 마지막날이 몇일인지도 알아야함.
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		showDay(week, lastDay);
		
	}
	private void showDay(int week,int lastDay) {	//이 자바파일에서만 쓰기 때문에 private
		
		int lineCnt = 0;
		System.out.println("-----------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토\n");
		System.out.println("-----------------------------------------------------");
		/*week : 1 일 1
		week : 2 월 \t1
		week : 3 화 \t\t1 ......*/
		for(int i = 1 ;i < week;i++) {
			System.out.print("\t");
			lineCnt++;
		}
		for(int day = 1; day<=lastDay; day++) {
			System.out.print(day + "\t");
			lineCnt++;
			if(lineCnt % 7 ==0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
	}
}
