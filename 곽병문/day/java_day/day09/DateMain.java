package kr.co.mlec.day09;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println("d : " + d);
		
		// 날짜정보 : 2018년 7월 13일
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		
		System.out.println("날짜정보 : " + year + "년 " + month + "월 " + date + "일");
		
	}

}
