package day10Hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Machine {

	private List<Ball> balls = new ArrayList<>();
	private int ballIndex = 0;
	
	public Machine() {
		for(int i = 1; i <= 45; i++) {
			balls.add(new Ball(i));
		}
	}
	
	public void start() {
		Collections.shuffle(balls);
	}
	
	public Ball getBall() {
//		return balls.get(ballIndex++);
		return balls.remove(0);
	}
}













