package kr.co.mlec.homework.homework06;

import java.util.Random;

public class AreaMain {

	public static void main(String[] args) {
		
		Random r = new Random();
		int a, b;
		
		int n = r.nextInt(4) + 1;
		a = r.nextInt(9) + 1;
		
		if(n>1 && n<4) {
			b = r.nextInt(9) + 1;
			CalcTool ct = new CalcTool(n, a, b);
		}else {
			CalcTool ct = new CalcTool(n, a);
		}
		
	}

}
