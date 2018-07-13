package kr.co.day50;

public class Dice implements Game {

	@Override
	public int startGame(int you) {
		
		int me = r.nextInt(6)+1;
		String str = null; 
		
		if(you > 0 && you < 6) {
			str = me == you ? "You win" : "You lose";
		} else {
			System.out.println("다시 입력하세요");
		}
		
		System.out.println(str);
		
		int winOrLose = str == "You win" ? 1 : 0;
		
		return winOrLose;
	}
	

}
