package kr.co.mlec.day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// dog.jpg ==> dog2.jpg 복사
/*
	작업순서
	1. stream open
	2. 작업수행(input/output)
	3. stream close
 */
public class FileIOMain02 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
				
		try {
			// 1. stream open
			fis = new FileInputStream("iotest/dog.jpg");
			fos = new FileOutputStream("iotest/dog2.jpg");
			
			long start = System.currentTimeMillis();
			// 2. 작업수행(read/write)
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			long end = System.currentTimeMillis();
			System.out.println("파일 저장 완료");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 3. stream close
			if(fis != null) {
				try{
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}










