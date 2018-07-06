package kr.co.mlec.homework.homework03;

import java.util.Scanner;

/*
 * 학생 5명의 성적을 입력받아 다음과 같이 출력하는 코드를 입력
 * 1's 성적 : 84					90~100 : A
 * 2's 성적 : 1000				80~89  : B
 * 3's 성적 : -45					70~79  : C
 * 4's 성적 : 99					60~69  : D
 * 5's 성적 : 56					0~59   : F
 * 
 * < PRINT >
 * 번호	성적	학점
 *  1	84	 B
 *  2	ERROR!!!
 *  3	ERROR!!!
 *  4	99	 A
 *  5	56	 F
 * 5회 입력 중 [2]회 에러발생
 * 총점 : 239점			// 올바른것만
 * 평균 : 47.80점			// 총점/모두
 */

public class Homework03_11 {
	
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		int[] score = new int[5];		// 성적
		char c;							// 학점
		int e = 0;						// 에러수
		int sum = 0;						// 총점
		
		for(int i=0; i<score.length; i++) {			// 점수 입력
			System.out.printf("%d\'s 성적 : ", i+1);
			score[i] = s.nextInt();
		}
		System.out.println();
		
		System.out.println("< PRINT >\n번호 \t 성적 \t 학점");
		for(int i=0; i<score.length; i++) {
			if(score[i]>=0 && score[i]<=100) {
				switch(score[i]/10) {
					case 10 :
					case 9 :
						c = 'A';
						break;
					case 8 :
						c = 'B';
						break;
					case 7 :
						c = 'C';
						break;
					case 6 :
						c = 'D';
						break;
					default :
						c = 'F';
				}
				sum += score[i];
				System.out.printf("%d \t %d \t %c\n", i+1, score[i], c);
			}
			else {
				System.out.printf("%d \t ERROR!!!\n", i+1);
				e++;
			}
		}
		System.out.println("    5회 입력 중 [" + e + "]회 에러발생");
		System.out.println("\t총점 : " + sum + "점");
		System.out.println("\t평균 : " + sum/(score.length-e) + "점");
		
		
		s.close();
	}
}
