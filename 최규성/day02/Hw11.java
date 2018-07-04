package day02;
import java.util.Scanner;

public class Hw11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수: ");
		int b = sc.nextInt();
		System.out.print("세번째 정수: ");
		int c = sc.nextInt();
		System.out.print("네번째 정수: ");
		int d = sc.nextInt();
		
		
		if((a>b) && (a>c) && (a>d)) {
			System.out.println(a);
		} else if ((b>a) && (b>c) && (b>d)) {
			System.out.println(b);
		} else if((c>a)&&(c>b)&&(c>d)) {
			System.out.println(c);
		} else {
			System.out.println(d);
		}

	}

}
