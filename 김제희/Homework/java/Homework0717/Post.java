package kr.co.Homework0717;

public class Post {
	
	private int num; 
	private String author; 
	private String day;
	private String title;
	
	public Post() {
		super();
	}
	
	public Post(int num, String author, String day, String title) {
		super();
		this.num = num;
		this.author = author;
		this.day = day;
		this.title = title;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	@Override
	public String toString() {
		return num + "\t" + author + "\t" + day + "\t" + title;
	}
	
}
