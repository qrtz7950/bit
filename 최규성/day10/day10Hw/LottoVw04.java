package day10Hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoVw04 {

	private Scanner sc = new Scanner(System.in);
	
	public void start() {
		
		System.out.println("<< LOTTO #4 >>");
		System.out.print("게임수를 입력하세요 : ");
		int gameCnt = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println(i + "게임 : " + getLottoNums());
		}
	}
	
	private String getLottoNums() {
		
		Set<Integer> lottoNums = new HashSet<Integer>();
		
		Random r = new Random();
		
		while(lottoNums.size() < 6) {
			lottoNums.add(r.nextInt(45) + 1);
		}
		
		return Arrays.toString(lottoNums.toArray());
	}
}











