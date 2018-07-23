package kr.co.mlec.homework.homework08;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ControlGame c = new ControlGame();
		char sel;
		int you, score = 0;
		
		while(true) {
			sel = c.menu();
			
			
			if(sel == 'A') {
				ScissorsRockPaper srp = new ScissorsRockPaper();
				you = c.srpsel();
				score += srp.startGame(you);
			}else if(sel == 'B') {
				Dice d = new Dice();
				you = c.dsel();
				score += d.startGame(you);
			}else {
				System.out.println("게임을 종료합니다.");
				System.out.println("당신의 total score는 " + score + "입니다.");
				break;
			}
		}
		s.close();
	}

}
