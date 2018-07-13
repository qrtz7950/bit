package kr.co.mlec.day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
	
	public static void main(String[] args) {

		Date d = new Date();
		
		System.out.println("d: " + d);
		//오버라이드된 toString 메소드이기때문에 시간을 반환
		
		//날짜정보: 2018년 7월 13일
		int year = d.getYear() + 1900; //1900년부터 반환하므로 +1900
		int month = d.getMonth() + 1; //0~11까지 반환하므로 +1
		int date = d.getDate(); //옆에 뜨는 워닝은 deprecated
		//다음 JDK버젼에서 사라질지도 모른다는거임
		
		//d. 메소드 목록을 보면 회색 사선이 그어져있는데 이게 다 디프리케이티드 메소드들
		
		System.out.println("날짜정보: " + year + "년 " + month + "월" + date + "일");
		//이제 안쓸 date말고 그레고리력 캘린더클래스를 써보자
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal: " + cal);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1; // 0~11반환
		date = cal.get(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토) 반환
		
		String [] dayArr = {"","일","월","화","수","목","금","토"}; 
		System.out.println(year + "년 " + month + "월 " + date + "일 " + dayArr[dayOfWeek] + "요일");
		
		// 2021년 9월 15일이 무슨요일?
		
		cal.set(2021, 9-1, 15);
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021년 9월 15일 " + dayArr[dayOfWeek] + "요일");
		
		Date da = cal.getTime();
		System.out.println("d : " + da);
		
		System.out.println("c : " + cal);
		cal.setTime(new Date());
		System.out.println("c : " + cal);
		
		System.out.println("Month 중 MAX : " + cal.getActualMaximum(Calendar.MONTH));
		cal.set(Calendar.MONTH, Calendar.FEBRUARY);
		System.out.println("이번 달의 마지막날은?: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println("-------------------------------------------------");
		
		//2017년 7월 13일 (금)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 d일(E)");
		System.out.println("날짜정보: " + sdf.format(new Date()));
		
		
		// 2017-0713 16:20:23
		String pattern = "yyyy-MM-dd HH:mm:ss";
		sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		
				
	}
}