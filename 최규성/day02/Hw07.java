package day02;
import java.util.Scanner;
public class Hw07 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 알파벳: ");
		String inputStr = sc.nextLine();
		char c = inputStr.charAt(0);
		
		if(c > 65 || c < 90){
			System.out.println("변경된 값: " + (char)(c+32));
		} else if (c > 97 || c <= 122) {
			System.out.println("변경된 값: " + (char)(c-32));
		}
		
	}

}
