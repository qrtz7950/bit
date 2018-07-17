package day10Hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoVw01 {

	private Scanner sc  = new Scanner(System.in);
	public void start1() {
		System.out.print("게임수를 입력하세요: ");
		int gameCnt = Integer.parseInt(sc.nextLine());
		
		for(int i = 1 ; i <= gameCnt; i++) {
			System.out.println(i + "게임 : " + getLottoNums());
		}
	}
	
	private String getLottoNums() {
		
		int[] lottoNums = new int[6];
		
		Random r = new Random();
		loop : for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = r.nextInt(45) + 1;
			for(int j = 0; j < i ; j++) {
				if(lottoNums[j] == lottoNums[j]) {
					continue loop;
				} else {
					i++;
				}
			}
			
		}
		
		
		return Arrays.toString(lottoNums);
	}
	
}
