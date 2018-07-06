package kr.co.mlec.day04;

/* 
 * 인식표 이용한 break(while, do while, for, switch에서 인식표 가능)
 */

public class LoopMain05 {

	public static void main(String[] args) {
		
		forI: for(int i=1; i<=3; i++) {
			System.out.println("i for()문 진입");
			forJ: for(int j=1; j<=2; j++) {
				System.out.println("\tj for()문 진입");
				break forI;
			}
			System.out.println("\tj for()문 종료");
		}
		System.out.println("i for()문 종료");

	}

}
