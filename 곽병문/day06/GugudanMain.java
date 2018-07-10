package kr.co.mlec.day06;

public class GugudanMain {

	public static void main(String[] args) {
		
		Gugudan gu = new Gugudan();
		
		int dan = gu.getDan("2 - 9 사이의 단을 입력 : ");
		
		System.out.println();
		
		gu.pr(dan);
		
		// gu.pr();
		
		int startDan = gu.getDan("시작단을 입력 : ");
		int endDan = gu.getDan("종료단을 입력 : ");
		
		gu.pr(startDan, endDan);
	}
}
