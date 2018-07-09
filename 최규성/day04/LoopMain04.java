package day04;
import java.util.Scanner;

/*
 *  1 ~10 사이의 정수를 입력하면 숫자만큼 "Hello"를 출력
 *  단, 1~10 정수가 아니면 1번의 "Hello"를 출력
 */
public class LoopMain04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("반복할 횟수 입력: ");
		int cnt = sc.nextInt();

		
		for (int i = 1; i <= cnt; i++) {
			System.out.println("Hello");
			if(cnt>10) {
				break;
			}
		}
		
		for(int i =1 ; i <=cnt ;i++) {
			System.out.print("hello");
			if (i % 2 ==1) {
				System.out.println();
			}
		}
		
		/*if (cnt <= 10) {
			for (int i = 1; i <= cnt; i++) {
				System.out.println("Hello");
			}
		} else {
			System.out.println("Hello!!");
		}*/
	}

}
