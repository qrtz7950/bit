package kr.co.mlec.day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  Ai.jpg ==> Ai.jpg 복사
 *  
 *  1. stream open
 *  2. 작업수행(input/output)
 *  3. stream close
 */

public class FileIOMain02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("iotest/Ai.jpg");
			fos = new FileOutputStream("iotest/Ai2.jpg");	// 내용이 없는 빈파일 생성
			
			long start = System.currentTimeMillis();
			
			while(true) {					// fis 읽어서 fos에 쓰기
				int c = fis.read();
				if(c==-1) {
					break;
				}
				fos.write(c);
			}
			System.out.println("파일저장 완료");
			long end = System.currentTimeMillis();
			System.out.println("걸린 시간 : " + (end-start)/1000. + "초");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();			// close
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
