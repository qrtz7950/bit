package kr.co.Homework0712;

import java.util.Random;

public class AreaMain {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		Area_abstract a = null;
		
		String str = null;
		int num = r.nextInt(4)+1;
		
		switch (num) {
		case 1 : 
			str = "정사각형";
			a = new Square();
			break;
		case 2 : 
			str = "직사각형";
			a = new Rectangle();
			break;
		case 3 : 
			str = "삼각형";
			a = new Triangle();
			break;
		case 4 : 
			str = "원";
			a = new Circle();
			break;
		}
		
		System.out.print(str + "의 면적은 ");
		
		int areaRandNum = r.nextInt(7)+2;
		
		if(num == 1 || num == 4) {
			System.out.print(a.area(areaRandNum));
		} else {
			System.out.print(a.area(areaRandNum));
			
		}
		
	}
		
		

}
