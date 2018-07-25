package kr.co.mlec.homework.homework10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Form {
	private int num;
	private String writer;
	private String day;
	private String title;
	
	public Form() {
		
	}

	public Form(String title, String writer) {
		this.writer = writer;
		this.title = title;
		this.num = ++Board.totalnum;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		this.day = sdf.format(new Date());
	}
	
	public Form(String title, String writer, int num) {
		this.writer = writer;
		this.title = title;
		this.num = num;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		this.day = sdf.format(new Date());
	}

	@Override
	public String toString() {
		return num + "\t" + writer + "\t" + day + "\t" + title;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
