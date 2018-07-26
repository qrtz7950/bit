package board.v2.u4.vo;

public class BoardVO {
	private int no;
	private String writer;
	private String title;
	private String regDate;
	
	public BoardVO() {}
	
	public BoardVO(int no, String writer, String title, String regDate) {
		this.no = no;
		this.writer = writer;
		this.title = title;
		this.regDate = regDate;
	}
	
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
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", writer=" + writer + ", title=" + title
				+ ", regDate=" + regDate + "]";
	}
}