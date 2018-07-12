package kr.co.mlec.day02;

import java.util.Random;

public class OperationMain03 {
	
	public static void main(String[] arg) {
		
		Random r = new Random();
		int num = r.nextInt(11);	// 1 ~ 10
		
		System.out.println("ÃßÃâµÈ num : " + num);
		
		String msg = (num % 2 == 0) ? "Â¦¼ö" : "È¦¼ö";
		
		System.out.println(msg);
		System.out.println((num % 2 == 0) ? "Â¦¼ö" : "È¦¼ö");
		
		int n = r.nextInt(11);		// 0 ~ 10
		System.out.println("ÃßÃâµÈ n : " + n);
		System.out.println((n==0)?"ÇØ´çx":((n % 2 == 0) ? "Â¦¼ö" : "È¦¼ö"));
		
	}

}
