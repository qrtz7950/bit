package day10Hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoVw02 {

	private Scanner sc = new Scanner(System.in);
	
	public void start() {
		
		System.out.println("<< LOTTO #2 >>");
		System.out.print("게임수를 입력하세요 : ");
		int gameCnt = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println(i + "게임 : " + getLottoNums());
		}
	}
	
	private String getLottoNums() {
		int[] lottoNums = new int[6];
		boolean[] lottoFlag = new boolean[45+1];	// 0 ~ 45	
		
		Random r = new Random();
		for(int i = 0; i < lottoNums.length; ) {
			int random = r.nextInt(45) + 1;
			
			if(!lottoFlag[random]) {
				lottoNums[i++] = random;
				lottoFlag[random] = true;
			} 
		}
		
		return Arrays.toString(lottoNums);
	}
}











