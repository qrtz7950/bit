package day04;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[4];

		for (int i = 0; i < nums.length; i++) {
			System.out.print("num" + (i + 1) + " : ");
			nums[i] = sc.nextInt();

		}
		for(int k=0;k<=1;k++) {
			System.out.println((k == 0 ?"Â¦¼ö" : "È¦¼ö"));
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] % 2 == k) {
					System.out.println(" " + nums[i]);
				}	
			}
		}
	}

}
