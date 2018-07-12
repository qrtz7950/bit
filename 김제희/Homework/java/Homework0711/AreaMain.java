package kr.co.Homework0711;

import java.util.Random;

public class AreaMain {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		Area a = new Area();
		
		int randnum = r.nextInt(4)+1;
				
		if(randnum == 1 || randnum == 4) {
			int areaRand = r.nextInt(7)+2;
			a.getArea(randnum, areaRand);
		} else {
			int area = r.nextInt(7)+2;
			int area2 = r.nextInt(7)+2;
			a.getArea(randnum, area, area2);
		}
	}
		
		

}
