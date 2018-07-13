package kr.co.day50;

import java.util.Random;

/**가위바위보 게임 
 * 
 * @author 김제희
 *
 */
public class ScissorsRockPaper implements Game {

	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	public int startGame(int you) {
		
		int me = r.nextInt(3)+1;
		String str = null; 
		
		if (you > 0 && you < 4) {
			if(you == me) {
				System.out.println("비겼습니다");
			} else if(me == 1) {
				str = you==2 ? "You win" : "You lose"; 
			} else if (me == 2) {
				str = you==3 ? "You win" : "You lose";
			} else {
				str = you==1 ? "You win" : "You lose";
			}
		} else {
			System.out.println("다시 입력하세요");
			return 0;
		}
		
		System.out.println(str);
		
		int winOrLose = str == "You win" ? 1 : 0;
		
		return winOrLose;
	}
	
}
