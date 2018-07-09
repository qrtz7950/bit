package day04Hw;

import java.util.Arrays;
import java.util.Scanner;

public class Hw10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print("num" + (i+1) + " : ");
			nums[i]  = sc.nextInt();
			
			if(i != 0 && nums[i] < nums[i-1]) {
				for(int j = 0 ; j < i ; j++) {
					System.out.print(nums[j]+" ");
				}
				System.out.println("보다 큰 수여야 합니다");
				i--;
			}
		}
		
		System.out.println("<PRINT>");
		System.out.println(Arrays.toString(nums));
	}

}
