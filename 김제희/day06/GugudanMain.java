package kr.co.mlec.day06;

public class GugudanMain {

	public static void main(String[] args) {

		Gugudan gu = new Gugudan();
		
//		System.out.print("2 - 9사이의 단을 입력 : ");
//		int dan = gu.getDan();
		
		int dan = gu.getDan("2 - 9사이의 단을 입력 : ");
		
		gu.print(dan);
				
		gu.print();
		
		int startDan = gu.getDan("시작단을 입력: ");
		int endDan = gu.getDan("종료단을 입력: ");
		
		gu.print(startDan, endDan);
		
	}

}
