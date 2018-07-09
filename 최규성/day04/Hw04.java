package day04Hw;
import java.util.Scanner;
public class Hw04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9 사이의 정수입력: ");
		int a = sc.nextInt();
		for (int i = a; i < a+1; i++) {
			System.out.println(i+"단");
			for (int j = 2; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));

			}
			
		}

	}

}
