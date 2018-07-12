package kr.co.Homework0709;

import java.util.Scanner;

class Calculate {
	static void cal(int a,int b) {
		
		double aa = a;
		double bb = b;
		
		System.out.println(a +" + "+ b + " = "+ (a+b));
		System.out.println(a +" - "+ b + " = "+ (a-b));
		System.out.println(a +" * "+ b + " = "+ (a*b));
		System.out.printf(a +" / "+ b + " = "+ "%.1f",aa/bb);
		
		
		
		int [] abArr = {a,b};
				
		for (int number : abArr) {
			int m =0;
			for(int i = 0; i<number; i++) {
				if(number % (i+1) == 0) {
					m++;
				} 
			}
			System.out.print("\n"+ number + "의 소수 판별: ");
			
			if (m>2) {
				System.out.println("false");
			} else {
				System.out.println("true");
			}
		}
		
	}
}

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculate c = new Calculate();
		
		System.out.print("정수입력: ");
		int a = sc.nextInt();
		System.out.print("정수입력: ");
		int b = sc.nextInt();
		
		c.cal(a,b);
		
	}

}
