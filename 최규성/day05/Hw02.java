package day05Hw;

import java.util.Scanner;

class Calculate {
	Calculate(int[] a) {
		System.out.println(a[0] + " + " + a[1] + " = " + (a[0] + a[1]));
		System.out.println(a[0] + " - " + a[1] + " = " + (a[0] - a[1]));
		System.out.println(a[0] + " * " + a[1] + " = " + (a[0] * a[1]));
		System.out.println(a[0] + " / " + a[1] + " = " + ((double) a[0] / a[1]));
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 1) {
				int remainder = 1;
				for (int j = 2; j < a[i]; j++) {
					remainder = a[i] % j;
					if (remainder == 0) {
						break;
					}
				}
				System.out.println(a[i] + "의 소수체크 : " + (remainder != 0));
			} else {
				System.out.println(a[i] + "의 소수체크 : false");
			}
		}
	}
}

public class Hw02 {

	public static void main(String[] args) {

		int[] a = new int[2];
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			System.out.print("정수 입력 : ");
			a[i] = s.nextInt();
		}
		
		Calculate calc = new Calculate(a);
		
		s.close();
	}

}
