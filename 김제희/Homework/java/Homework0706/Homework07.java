package kr.co.Homework0706;

public class Homework07 {

	public static void main(String[] args) {
		
		int h = 0;
		int t = 0;
		
		System.out.println("달팽이 기어올라욧!");
		
		while(h<100) {
			h += 5;
			t++;
			if(h<50) {
				h -=1;
			} else {
				h -=2;
			}
			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %d\n",t,h);
		}
		System.out.printf("달팽이가 총 %d시간을 걸려 다 올라왔어욧\n",t);
		
	}

}
