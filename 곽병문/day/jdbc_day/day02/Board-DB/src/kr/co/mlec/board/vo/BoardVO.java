package kr.co.mlec.board.vo;

/*
 	VO : Value Object
 	
 	alt + shift + s 누른 후  c 선택 : 기본생성자
 	alt + shift + s 누른 후  o 선택 : 매개변수를 가지는 생성자
 	alt + shift + s 누른 후  r 선택 : getter/setter 메소드
 	alt + shift + s 누른 후  s 선택 : toString() 메소드 override
 */

public class BoardVO {
	private int 	no;			// 글번호
	private String 	title;		// 제목
	private String 	writer;		// 글쓴이
	private int		viewCnt;	// 조회수
	private String 	regDate;	// 등록일
	
	public BoardVO() {
		super();
	}

	public BoardVO(int no, String title, String writer, int viewCnt, String regDate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.viewCnt = viewCnt;
		this.regDate = regDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", viewCnt=" + viewCnt + ", regDate="
				+ regDate + "]";
	}
}










