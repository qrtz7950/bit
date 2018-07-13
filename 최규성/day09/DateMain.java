package day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
/*
		Date d = new Date();
		
		System.out.println("d: "+ d.toString());
		
		//날짜 정보: 2018년 7월 13일
		int year = d.getYear() +1900;	//1900년부터 반환하기 때문에 +1900 , 중앙선은 다음 버전에서 어떻게 될지 모르는 메소드
		int month = d.getMonth()+1; //0~11이라 +1
		int date = d.getDate();
		
		System.out.println("날짜정보: " + year + month + date);
		
		System.out.println();*/
		
		Calendar c = Calendar.getInstance();
		System.out.println("c: "+ c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
//		int date = c.get(Calendar.DATE);
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);
		String[] dayArr = {" ","일","월","화","수","목","금","토","일"};
		
		System.out.println("날짜정보: " + year +"년 "+ month +"월 "+date+"일 "+dayArr[day]+"요일");
	
	
		//2021년 9월 15일은 무슨 요일 인가?
		c.set(2021, 9 - 1,15);	//0~11월표기라서 1을 빼줌
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021년 9월 15일" + dayArr[day]+" 요일");
		
		Date d = c.getTime();
		System.out.println("d: "+ d);
		
		System.out.println("c: "+ c);
		c.setTime(new Date());
		System.out.println("c: "+ c);
		
		System.out.println("MONTH중 Max: "+(int) (c.getActualMaximum(Calendar.MONTH)+1));
		
		System.out.println("7월의 마지막날수: "+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		c.set(Calendar.MONTH, Calendar.FEBRUARY);	//현재달을 2월로 세팅
		System.out.println("현재달의 마지막날수: "+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println("---------------------------");
		
		//오늘 날짜 2018년 7월 13(금)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (EE)");
		System.out.println("날짜정보: " + sdf.format(new Date()));
		
		System.out.println("---------------------------");
		
		// 2018-07-13 16:20:23
		String pattern = "yyyy-MM-dd HH:mm:ss";
		sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		
	
	
		}

}
