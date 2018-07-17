package kr.co.mlec.day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileMain01 {

	public static void main(String[] args) {

		System.out.println("쳐라! ctrl+z시 종료 =>");
		
		InputStream is = System.in;
		Reader isr = new InputStreamReader(is);
		try {
		while(true) {
			int c = isr.read();
			if(c==-1) {
				break;
			}
			System.out.print((char)c);
		} 
		}catch (IOException e) {
				e.printStackTrace();
		} 

		
/*			
		try {
			while(true) {
				int c = is.read(); //스트림은 문자 or 바이트인데 이는 모두 숫자기 때문에 리턴값이 인트다
				if(c==-1) {
					break;
				}
				System.out.print((char)c);
			} 
		}catch (IOException e) {
			e.printStackTrace();
		} 
*/	
	}

}
