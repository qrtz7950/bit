package kr.co.mlec.homework.homework08;

import java.util.Random;

/**
 * 주사위 게임
 * @author 도트박이
 *
 */
public class Dice implements Game {
	
	public int startGame(int you) {
		
		Random r = new Random();
		int me = r.nextInt(6) + 1;
		int result = 0;
		String str;
		
		if(me == you) {
			str = "You win";
		}else {
			str = "You lose";
		}
		
		if(str == "You win") {
			result = 1;
		}
		
		System.out.println(str);
		
		return result;
	}
	
}
