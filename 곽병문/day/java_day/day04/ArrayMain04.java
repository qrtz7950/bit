package kr.co.mlec.day04;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		// Shallow copy
/*		
		int[] n = {10, 20, 30, 40, 50};
		int[] n2;
		
		n2 = n;
		
		n[0] = 100;
		
		System.out.println(n2 + ", " + n);
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(n2));
*/
		// Deep copy
		int[] n = {10, 20, 30, 40, 50};
		int[] n2 = new int[n.length];
		
		for(int i=0; i<n.length; i++) {
			n2[i] = n[i];
		}
		
		n[0] = 100;
		
		System.out.println(n2 + ", " + n);
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(n2));
		
		System.arraycopy(n2, 3, n, 0, 2);
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(n2));
	}

}
