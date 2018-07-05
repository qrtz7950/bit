package kr.co.mlec.homework.homework01;

import java.util.Scanner;

public class Homework01_10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int a = s.nextInt();
		System.out.print("두번째 정수 : ");
		int b = s.nextInt();
		System.out.print("세번째 정수 : ");
		int c = s.nextInt();
		
		if(a>b) {								// 가장 큰수 출력
			if(a>c) {
				System.out.print(a+"\t");
			}
			else {
				System.out.print(c+"\t");
			}
		}
		else {
			if(b>c) {
				System.out.print(b+"\t");
			}
			else {
				System.out.print(c+"\t");
			}
		}
//--------------------------------------------------------------
		if(a>b) {								// 중간값 출력
			if(a<c) {
				System.out.print(a+"\t");
			}
			else if(c>b){
				System.out.print(c+"\t");
			}
			else {
				System.out.print(b+"\t");
			}
		}
		else {
			if(b<c) {
				System.out.print(b+"\t");
			}
			else if(c>a){
				System.out.print(c+"\t");
			}
			else {
				System.out.print(a+"\t");
			}
		}
//--------------------------------------------------------------
		if(a<b) {								// 가장 작은수 출력
			if(a<c) {
				System.out.print(a+"\t");
			}
			else {
				System.out.print(c+"\t");
			}
		}
		else {
			if(b<c) {
				System.out.print(b+"\t");
			}
			else {
				System.out.print(c+"\t");
			}
		}
		
		s.close();
		

	}
}
