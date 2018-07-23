package kr.co.mlec.homework.homework06;

public class CalcTool {
	
	CalcTool(){
		
	}
	
	CalcTool(int n, int a){
		
		if(n==1) {
			System.out.printf("정사각형의 면적은 %d 입니다", a*a);
		}else {
			System.out.printf("원의 면적은 %d 입니다", (int)(a*a*3.14));
		}
		
	}
	
	CalcTool(int n, int a, int b){
			
		if(n==2) {
			System.out.printf("직사각형의 면적은 %d 입니다", a*b);
		}else {
			System.out.printf("삼각형의 면적은 %d 입니다", a*b/2);
		}
			
	}
}
