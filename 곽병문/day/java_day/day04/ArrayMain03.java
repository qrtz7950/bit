package kr.co.mlec.day04;

public class ArrayMain03 {
	
	public static void main(String[] arg) {
		
		int[] arr = {10, 20, 30, 40, 50};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		arr = new int[7];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*100;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		arr = new int[] {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
