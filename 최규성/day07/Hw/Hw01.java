package day07Hw;
import java.util.Scanner;
public class Hw01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ControlString a = new ControlString();
		String str;
		char c;
		
		
		System.out.print("문자열 입력 : ");
		str = s.nextLine();		
		System.out.print("문자열에서 개수를 확인해볼 문자 입력: ");
		c = s.nextLine().charAt(0);
		
		System.out.println("같은 글자수: " + a.checkChar(str, c) + "개");
		System.out.println("===============================");
		
		
		System.out.print("문자열 입력 : ");
		str = s.nextLine();		
		
		System.out.print("문자열에서 지울 문자 입력 : ");
		c = s.nextLine().charAt(0);
		System.out.println(a.removeChar(str, c));
		System.out.println("===============================");
		
		s.close();
	}

}
