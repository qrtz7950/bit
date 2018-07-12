package kr.co.mlec.homework.homework07;

import java.util.Random;

abstract class Calc {
	
	Random r = new Random();
	
	protected int a = r.nextInt(9) + 1;
	abstract void calc();

}
