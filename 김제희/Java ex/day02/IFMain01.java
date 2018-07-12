package kr.co.mlec.day02;

import java.util.Scanner;

/*
 * 1.기상한다;
 * if(조건식){	//조건을 만족한다면 브레이스 안을 수행 불만족이라면 브레이스를 건너뜀
 * 	2.밥먹고; 		//어떨때는 밥먹고 가고 안먹고가기도하고
 * }			//제어를 가해야하는 문장에 브레이스를 걸어준다
 * 3.학교간다;
 * 
 * 1-> 조건참 	-> 2-> 3
 * 1- >조건거짓        	-> 3
 * 
 * -----------------------
 * 기상한다;
 * if() {
 * 		걸어서;
 * }
 * if() {
 * 		버스타고;
 * }
 * 학교간다;
 * 
 * 해당 코드는 4가지의 경우의 수가 나오나 (TT TF FT FF) TT나 FF의 경우는 있을 수 없다
 * 
 * 그래서 if문을 두개 쓰지않고 if와 else를 사용한다
 * 
 * if(조건) {
 * 		걸어서;
 * } else {
 * 		버스타고;
 * } 
 *
 * 1 -> 조건 참 ->  2 -> 4
 * 1 -> 조건 거짓-> 3 -> 4
 * 
 * --------------------
 * 8시를 기준으로 넘으면 버스 전이면 걸어서간다고해보자 
 * if(8시이전)일때와 if(8시이후)일때 손바닥뒤집기처럼 if와 else를 바꿔서 쓸수있다.
 * 
 *
 */
public class IFMain01 {

	public static void main(String[] args) {
		/*
		 * 보유하고 있는 책 권수를 입력: 1
		 * 1 book
		 * 보유하고 있는 책 권수를 입력: 10
		 * 10 books
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고있는 책권수 입력: ");
		int book = sc.nextInt();

		
/*
		 * System.out.print(book + " book");
				
		if(book>=2) {
			System.out.print("s");
		}
*/

/*		
		if(book == 1) {
			System.out.print(book + " book");
		} else {
			System.out.print(book + " books");
		}
*/		
/*		
		if(book > 1) {
			System.out.print(book + " books");
		} else {
			System.out.print(book + " book");
		}
*/
}
}
