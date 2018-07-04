package day02;
import java.util.Scanner;
public class Hw05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("달러 입력: ");
		int dol = sc.nextInt();
		double won = (double)dol * 1092.50;
		System.out.printf("원화: " + won);
		
	}

}
