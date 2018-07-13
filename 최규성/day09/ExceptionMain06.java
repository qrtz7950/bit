package day09;

import java.util.Scanner;

public class ExceptionMain06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Sign In your ID: ");
			String id = sc.nextLine();

			if (id.length() < 5) { // ID가 5자 미만이면 예외로 처리하고싶음
				//throw new Exception("ID는 최소 5글자이상입니다."); // 내가 예외로 설정하고싶음
				throw new CheakIDException("ID는 최소 5글자이상입니다.");	//예외처리 문구까지 추가
			}
			System.out.println("ID를 등록했습니다.");
			System.out.println("ID: " + id);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
