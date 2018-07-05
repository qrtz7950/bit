package kr.co.mlec.day02;

import java.util.Scanner;

/*
 * 기상한다;
 * if(조건1){
 * 걸어서;
 * } else{
 * 		if(){
 * 			버스타고;
 * 		} else {
 * 		         택시타고;
 * 		}
 * }
 * 학교간다;
 * 
 * 1-> 조건1참 -> 2 ->5
 * 1-> 조건1거짓 -> 조건2참 -> 3 -> 5
 * 1-> 조건1거짓 -> 조건2거짓->4 -> 5
 * 
 * 위의 코드 else if를 사용하여 다른 방식으로 만들면
 * 
 * 기상한다;
 * if(조건1){
 * 		걸어서;
 * } else if() {
 * 		버스타고;
 * 		} 
 * 	 else {
 * 		 택시타고;
 * 		}
 * }
 * 
 * 종속적인 관계로 보이지 않게 else의 범위는 같으나 
 * 학교간다; * else안에 if else가 한번더 중첩된다 이를 중첩된 if else문이라고 한다.
 * 위의 예문은 1개 2개로 분리시켯지만
 * 1개 2개로 분리도 가능하다
 * 
 * 기상한다;
 * if(조건1){
 * 		if(조건2){
 * 			걸어서;
 * 		
 * 		} else { 
 * 			버스타고;
 * 		}
 * } else{
 * 택시타고
 * }
 * 학교간다;
 * 아침에 출발할때 8시 이전이면 걸어서 8시이후 15분전이면 버스타고 15분 이후면 택시탄다
 * 이런 것과 같이 시간의 흐름에 따른 제어문은 시간의 흐름 순서대로 또는 역순대로 짜는 것이 편하다 
 */
public class IFMain02 {

	public static void main(String[] args) {
		/*
		 * 보유하고 있는 책권수 : 0
		 * 보유하고 있는 책 없음
		 * 
		 * 보유하고 있는 책권수 입력 : 1
		 * 1 book
		 * 
		 * 보유하고 있는 책권수 입력 : 10
		 * 10 books
		 */
		Scanner sr = new Scanner(System.in);
		
		System.out.println("보유하고있는 책 권수 입력: ");
		int book = sr.nextInt();
		
/*		if(book == 0) {
			System.out.println("보유하고있는 책 없음");
		} else {
			if (book == 1) {
				System.out.println(book + "book");				
			} else {
				System.out.println(book + "books");
				}
			}
*/
		if(book == 0) {
			System.out.println("보유하고있는 책 없음");
		} else {
			if (book == 1) {
				System.out.println(book + "book");				
			} else {
				System.out.println(book + "books");
				}
			}
	}

}
