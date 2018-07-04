package day02;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("문자열입력: ");
//		String str = sc.next();  hello world를 입력하면 hello만 출력하고 world가 뜨지않음
		String str = sc.nextLine(); //엔터키를 누를때까지의 문자열 출력
		System.out.println("str: " + str);
		
		System.out.print("\n문자입력: ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("입력한 문자 :" + ch);
		
				
				
		System.out.print("\n논리값을 입력: ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool:" + bool);
		
		System.out.print("\n실수 입력:" );
		double d = sc.nextDouble();
		System.out.println("입력한 실수: " + d);
		
		System.out.print("\n정수입력: ");
		int num = sc.nextInt();
		System.out.println("입력한 정수: " + num);
	}

}
