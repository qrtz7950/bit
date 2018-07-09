package day04;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("num"+(i+1) +" : ");
			nums[i] = sc.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i <nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
		
	}

}
