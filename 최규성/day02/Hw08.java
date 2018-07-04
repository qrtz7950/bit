package day02;
import java.util.Scanner;
public class Hw08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("물건값: " );
		int a = sc.nextInt();
		System.out.print("지불금액: " );
		int b = sc.nextInt();
		int z = b-a;
		System.out.println("거스름돈: " + z);
		System.out.println("1000원: " + z/1000);
		z = z%1000;
		System.out.println(" 500원: " + z/500);
		z = z%500;
		System.out.println(" 100원: " + z/100);
		z = z%100;
		System.out.println("  50원: " + z/50);
		z = z%50;
		System.out.println("  10원: " + z/10);
		
	}

}
