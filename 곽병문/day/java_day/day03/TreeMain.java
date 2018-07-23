package kr.co.mlec.day03;

import java.util.Random;

public class TreeMain {

	public static void main(String[] args) {
		
		int treeHP = 10000;
		Random r = new Random();
		int treeHit;
		
		while(true) {
			treeHit = r.nextInt(1900)+100;
			if(treeHit>1500) {treeHit*=2;}
			treeHP -= treeHit;
			if(treeHit>3000) {
				System.out.println(treeHit+ "!!!!!");
			}			
			else{
				System.out.println(treeHit+ "!");
				}
			if(treeHP<0) {break;}
			System.out.println("나무HP : " + treeHP);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("나무 쓰러진다아아");
		
	}

}
