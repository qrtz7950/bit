package kr.co.mlec.day07;

import java.util.Arrays;

public class StringMain06 {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		String str = "";
		for(int i=0; i<100000; i++) {
			str = str +i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("소요 시간: " + (end-start)/1000. + "초");
		
		
		start = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<100000; i++) {
			sb.append(i);
		}
		
		end = System.currentTimeMillis();
		System.out.println("소요 시간: " + (end-start)/1000. + "초");
		
	}
}






