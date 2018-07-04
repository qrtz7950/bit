package day02;
import java.util.Scanner;

public class Hw04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("나눌 수를 입력하세요: ");
		int b = sc.nextInt();
		
		System.out.println("몫: " + a/b);
		System.out.println("나머지: " + a%b);
	}

}
