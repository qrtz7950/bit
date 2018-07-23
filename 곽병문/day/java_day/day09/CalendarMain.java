package kr.co.mlec.day09;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;	// 0~11
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK)-1;	// 1(일) ~ 7(토)
		
		String[] dayArray = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("날짜정보 : " + year + "년 " + month + "월 " + date + "일(" + dayArray[day] + ")");
		
		c.set(2021, 9-1, 15);
		day = c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("2021년 9월 15일 " + dayArray[day] + "요일");
		
		Date d = c.getTime();
		System.out.println("d : " + d);
		
		c.setTime(new Date());
		System.out.println("c : " + c);
		
		System.out.println("Month 중 Max : " + c.getActualMaximum(Calendar.MONTH));
		System.out.println("7월 마지막날 : " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
	}

}
