package day06;
/*
 * Main -> getDan(String msg) -> getDan() 순으로 진행
 * 
 */
public class GugudanMain {

	public static void main(String[] args) {

		Gugudan gu  = new Gugudan();
		
//		System.out.print("2-9사이의 단을 입력: ");
//		int dan = gu.getDan(); //구구단 클래스의 getDan을 필요로함, 구구단 클래스의 dan과는 다른 변수
		
		int dan = gu.getDan("2-9사이의 단을 입력: "); //리턴 타입은 int
		
//		System.out.println("*** "+ dan + "단 ***");
		
		gu.print(dan); //원하는 단 출력
		////////////////////////////////////////////////////////
		
		gu.print();		//모든 단 출력
		////////////////////////////////////////////////////////
		
		int startDan = gu.getDan("시작단을 입력: "); 	//범위안의 단 출력
		int endDan = gu.getDan("종료단을 입력: ");
		
		gu.print(startDan, endDan);
	}

}
