package board.v2.u2.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardVO {
	private int no;
	private String writer;
	private String title;
	private Date regDate;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(regDate);
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", writer=" + writer + ", title=" + title
				+ ", regDate=" + regDate + "]";
	}
}