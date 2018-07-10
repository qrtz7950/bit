package day05Hw;

import java.util.Scanner;

class Ice {
	String name;
	int won;
}

public class Hw01Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림 몇개 구입할래? : ");
		int a = Integer.parseInt(sc.nextLine()); // sc입력받은 문자열을 정수형을 변환
		sc.nextLine(); // 버퍼를 비워주기 위해 반드시 필요하다.
		System.out.println();
		Ice[] iceArr = new Ice[a];

		for (int i = 0; i < iceArr.length; i++) {
			iceArr[i] = new Ice();
		}

		for (int i = 0; i < a; i++) {
			System.out.println((i + 1) + "번째 아이스크림 정보입력");
			System.out.print("아이스크림 명: ");
			iceArr[i].name = sc.next();
			System.out.print("아이스크림 가격:");
			iceArr[i].won = sc.nextInt();
			sc.nextLine(); // 버퍼를 비워주기 위해 반드시 필요하다.
			System.out.println();

		}

		System.out.println("아이스크림 구매 정보");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for (int i = 0; i < iceArr.length; i++) {
			System.out.println((i + 1) + "\t" + iceArr[i].name + "\t\t" + iceArr[i].won);
		}
	}

}
