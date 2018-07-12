package kr.co.Homework0711;

public class Area {
	void getArea(int i, int rand) {
		
		double area = rand * rand;
		
		if(i == 4) {
			area = area *3.14; 
			System.out.printf("원의 넒이는 %.0f입니다", area);
		} else {
		System.out.printf("정사각형의 넒이는 %.0f",area);
		}
	}
	
	void getArea(int i, int rand, int rand2) {
		
		double area = rand * rand2;
		
		if(i == 3) {
			area = area/2;
			System.out.printf("삼각형의 넒이는 %.0f입니다", area);
		} else {
		System.out.printf("직사각형의 넒이는 %.0f입니다", area);
		}
	}
}
