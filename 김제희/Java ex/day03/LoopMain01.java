package kr.co.mlec.day03;

/*
 *  반복문 기본요소
 *  1.반복할 문장
 *  2.시작값
 *  3.증가/갑소
 *  4.종료조건
 *  
 *  1. 시작값;
 *  
 *  while(2.종료조건){
 *  	3.반복할 문장;
 *  	4.증가/감소
 *  }
 *  5.문장
 *  
 *  1 -> 2조건참 -> 3 -> 4
 *    -> 2조건참 -> 3 -> 4
 *    -> 2조건참 -> 3 -> 4
 *    -> 2조건거짓 -> 5
 *    
 * for()문을 알아보자
 * 
 * for(1.시작값; 2.종료문조건; 4.증가/감소) {
 * 	3.반복할 문장;
 * }
 * 
 * 1  -> 2조건참 -> 3 -> 4
 *    -> 2조건참 -> 3 -> 4
 *    -> 2조건참 -> 3 -> 4
 *    -> 2조건거짓 -> 5
 *    
 * 1.시작값;
 * do {
 * 		3.반복할 문장;
 * 		4.증가/감소;
 * }while(2.종료조건);
 * 5.문장;
 * 
 * 1	-> 			-> 3 -> 4
 * 		-> 2조건참	-> 3 -> 4
 * 		-> 2조건참	-> 3 -> 4
 * 		-> 2조건거짓	-> 5
 * 
 * for나 while에 비교하여 물어보는 횟수가 1회적음
 */
public class LoopMain01 {

	public static void main(String[] args) {
		
		int cnt = 1;
		
		//while
		while(cnt <= 5) {
		System.out.println("Hello");
		cnt++;
		}
		
		System.out.println("---------------------------------");
		
		//for
		for(int count = 1; count<= 5;count++){
		System.out.println("Hello");
		}
		
		
		//while이나 for문은 최소루프횟수 0회
		int j = 5;
		while(j<=0) {
			System.out.println("Hello");
			j--;
		}
		
		//do while은 최소루프횟수 1회
			int count = 1;
		do {
			System.out.println("Hello");
		}while(count <= 5); //while이 어떤 브레이스와 짝인지 알기쉽게 하기위해 세미콜론을 넣음
		//최소 루프 1회라는 특성으로 인해 에러체크 등에 사용된다
		//적어도 한번 이상 루프를 수행한다는 개념이 중요하다
		
		//for문 연습
		//헬로 5번찍기
		//for(int i = 1;i <=5 ;i++) {
		//for(int i = 1;i <=5 ;i++) {
		//for(int i = 5;i >=1 ;i--) {
		//for(int i = 5;i <=9 ;i++) {
		//for(int i = 10;i <=14 ;i++) {
		//for(int i = 3;i >=-1 ;i--) {
		for(int i = 1;i <=13 ;i+=3) {
			System.out.println("Hello");
		}
		
		
		
		
		}
	}

