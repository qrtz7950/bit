package kr.co.mlec.homework.homework03;

/*
 * 달팽이가 100M깊이의 우물에 빠졌습니다
 * 달팽이는 한시간에 5M속도로 우물을 기어오릅니다
 * 올라간 높이가 50M미만일 때는 한시간에 1M씩 미끌어지고,
 * 올라간 높이가 50M이상일 때는 한시간에 2M씩 미끌어집니다
 * 달팽이가 몇시간 만에 우물을 탈출하는지 코드를 작성
 * 
 * <출력결과>
 * [1시간후] 달팽이가 올라간 총 높이 : 4M
 * ...
 * [xx시간후] 달팽이가 올라간 총 높이 : 100이상
 */

public class Homework03_07 {
	
	public static void main(String[] arg) {
		
		int h = 0;		// 높이
		int t = 0;		// 시간
		
		while(h<100) {
			t++;
			h += 5;
			if(h<50) {
				h -= 1;
			}else {
				h -= 2;
			}
			
			System.out.println("["+ t +"시간후] 달팽이가 올라간 총 높이 :" + h + "M");
		}
	}
}
