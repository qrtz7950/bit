package day04;

public class LoopMain05 {

	public static void main(String[] args) {

		forI: for(int i =1; i<=3; i++) {			//forI라고 인식표를 붙일수있다.
			System.out.println(i +"i for()문 진입");
			forJ: for(int j = 1; j <=2; j++) {
				System.out.println(j + "	j for()문 진입");
				//break forI;
				break forJ;
			}
			System.out.println("	j for()문 종료");
			
		}
		
		System.out.println("i for()문 종료");
	}

	int[] iArr = new int[4];
}
