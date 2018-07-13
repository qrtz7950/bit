package day08Hw;

import java.util.Random;

abstract class Calculate {

	Random  r = new Random();
	
	int a = r.nextInt(19) + 1;
	abstract void calc();
}
