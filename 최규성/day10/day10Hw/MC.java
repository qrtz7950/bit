package day10Hw;

import java.util.Arrays;

public class MC {

	public void mentStart() throws Exception {
		
		System.out.println("제 XX회 로또 방송을 시작합니다");
		
		Machine machine = new Machine();
		machine.start();
		
		int[] lottoNums = new int[6];
		for(int i = 0; i < 6; i++) {
			Ball ball = machine.getBall();
			Thread.sleep(1000);
			System.out.println(i + 1 + "번째 로또 번호는 : " + ball.getNumber() );
			lottoNums[i] = ball.getNumber();
		}
		
		System.out.println("제 XX회 로또 당첨번호는 " + Arrays.toString(lottoNums) + "입니다");
	}
}









