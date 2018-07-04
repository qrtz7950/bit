package day02;
import java.util.Scanner;

public class Hw10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수: ");
		int b = sc.nextInt();
		System.out.print("세번째 정수: ");
		int c = sc.nextInt();
		
		if((a>b) && (a>c) && (b>c)) {
			System.out.println(a +" "+ b +" "+ c);
			if((a>b) && (a>c) && (c>b)) {
				System.out.println(a +" "+ c +" "+ b);
			}
		} else if ((b>a) && (b>c) && (a>c)) {
			System.out.println(b +" "+ a +" "+ c);
			if((b>a) && (b>c) && (c>a)) {
				System.out.println(b +" "+ c +" "+ a);
			}
		} else if((c>a)&&(c>b)&&(a>b)) {
			System.out.println(c +" "+ a +" "+ b);
			if((c>a)&&(c>b)&&(b>a)) {
				System.out.println(c +" "+ b +" "+ a);
			}
		}
	}

}
