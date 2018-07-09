package day04;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			System.out.print("num" + (i + 1) + " : ");
			nums[i] = sc.nextInt();

			/*
			 * for (int i = 0; i < nums.length; i++) { System.out.println(nums[i] + " "); }
			 */

		}
		System.out.println("Â¦¼ö");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.print(" "+nums[i]);
			}
		}
		System.out.println();
		
		System.out.println("È¦¼ö");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 1) {
				System.out.print(" "+nums[i]);
			}

		}
	}

}
