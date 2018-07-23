package kr.co.mlec.homework.homework08;

import java.util.Calendar;
import java.util.Scanner;



public class Show {
	
	protected Scanner s = new Scanner(System.in);
	protected Calendar c = Calendar.getInstance();
	protected int year, max_day, dayOfWeek;
	
	Show(){
		System.out.print("년도를 입력하세요 : ");
		year = Integer.parseInt(s.nextLine());
	}
	
	public void showCalendar() {}
}
