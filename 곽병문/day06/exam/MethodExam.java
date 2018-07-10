package kr.co.mlec.day06.exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodExam {
	
	int sum(int a, int b) {
		int c;
		c = a + b;
		
		return c;
	}
	
	int tsum(int a, int b) {
		int c=0;
		
		for(int i = a; i<=b; i++) {
			c += i;
		}
		
		return c;
	}
	
	void displaySum(int a, int b, int c) {
		System.out.printf("%d + %d = %d", a, b, c);
	}
	
	int getInt() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("정수 무엇? : ");
		int num = s.nextInt();
		
		return num;
	}
	
	// getNums() : 1~100사이의 난수를 10개 추출하여 호출자메소드에 전달하는 기능
	
	int[] getNums() {
		Random r = new Random();
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		
		return arr;
	}
	
	int[] getNums(int a) {
		Random r = new Random();
		int[] arr = new int[a];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		
		return arr;
	}
	
	int[] getNums(int size, int max) {	//size갯수만큼, 1~max까지의 난수
		Random r = new Random();
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(max)+1;
		}
		
		return arr;
	}
	
	void displayArray(int[] arr, int a) {
		System.out.println(Arrays.toString(arr));
	}
}
