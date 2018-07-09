package day04Hw;
import java.util.Random;
public class Hw09 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Random r = new Random();
//		int num = ; // 0 ~ 99

		for(int i = 0; i <arr.length ; i++){
			arr[i] = r.nextInt(99);
			System.out.print(" "+ arr[i]);
		}
		System.out.println();
		
		for(int j=0 ; j<arr.length; j++) {
			int n10 = arr[j] / 10;
			int n1  = arr[j] % 10;
			System.out.print(n1 * 10 + n10 + " ");
		}
		
	}

}
