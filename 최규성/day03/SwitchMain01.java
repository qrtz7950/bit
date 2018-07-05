package day03;
import java.util.Scanner;

public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1-3 사이의 정수: ");
		int num = sc.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("ONE");
				break;	
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			default :
				System.out.println("ERROR");
				break;
		}

	}

}
