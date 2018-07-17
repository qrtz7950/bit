package day10Hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LottoVw05 {

	private Scanner sc = new Scanner(System.in);
	
	public void start() {
		
		System.out.println("<< LOTTO #5 >>");
		System.out.print("게임수를 입력하세요 : ");
		int gameCnt = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println(i + "게임 : " + getLottoNums());
		}
	}
	
	private String getLottoNums() {
		
		List<Integer> numbers = new ArrayList<>();
		for(int i = 1; i <= 45; i++) {
			numbers.add(i);
		}
		
		Collections.shuffle(numbers);
		
		int[] lottoNums = new int[6];
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = numbers.get(i);
		}
		
		return Arrays.toString(lottoNums);
	}
}











