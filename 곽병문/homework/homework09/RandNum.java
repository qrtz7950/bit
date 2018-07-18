package kr.co.mlec.homework.homework09;

import java.util.Random;

public class RandNum {
	
	void rand(int i) {
		int r=0;
		int[] e = new int[6];
		
		switch(i) {
			case 0 :
				Random rand = new Random();
				for(int j=0; j<e.length; j++) {
					r = rand.nextInt(45) + 1;
					for(int k=0; k<e.length; k++) {
						if(e[k]==r) {
							j--;
							break;
						}
					}
					e[j] = r;
				}
				for(int j=0; j<e.length; j++) {
					System.out.print(" " + e[j] + " ");
				}
					break;
			case 1 :
				
				break;
			case 2 :
				
		}
	}
}
