package day02;
import java.util.Scanner;

public class IfMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("소유한 책 권수: ");
		int book = sc.nextInt();
		
		if(book > 1) {
			System.out.println(book + " Books");
		} else if(book == 1) {
			System.out.println(book + " Book");
		} else if(book ==0){
			System.out.println("보유한 책 없음");
		} else {
			System.out.println("잘못된 입력");
		}
		
	}
	
}