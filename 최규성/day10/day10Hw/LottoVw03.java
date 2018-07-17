package day10Hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoVw03 {

	private Scanner sc = new Scanner(System.in);
	
	public void start() {
		
		System.out.println("<< LOTTO #3 >>");
		System.out.print("게임수를 입력하세요 : ");
		int gameCnt = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println(i + "게임 : " + getLottoNums());
		}
	}
	
	private String getLottoNums() {
		int[] lottoNums = new int[6];
		int[] nums = new int[45];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
		}
		
		Random r = new Random();
		for(int i = 0; i < 6; i++) {
			int random = r.nextInt(45-i) + i;	// 0 - 45
//			System.out.println("random : " + random);
//			System.out.println(Arrays.toString(nums));
			
			int temp = nums[i];
			nums[i] = nums[random];
			nums[random] = temp;
//			System.out.println(Arrays.toString(nums));
			
			lottoNums[i] = nums[i];
		}
		
		return Arrays.toString(lottoNums);
	}
}











