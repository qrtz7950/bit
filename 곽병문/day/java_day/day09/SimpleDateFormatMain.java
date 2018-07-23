package kr.co.mlec.day09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatMain {

	public static void main(String[] args) {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일(E)");
		 System.out.println("날짜정보 : " + sdf.format(new Date()));
		 
		 String pattern = "yyyy-MM-dd HH:mm:ss";
		 sdf = new SimpleDateFormat(pattern);
		 System.out.println(sdf.format(new Date()));

	}

}
