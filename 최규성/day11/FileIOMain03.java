package kr.co.mlec.day11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain03 {

	// dog.jpg -> dog3.jpg 복사
	public static void main(String[] args) {
	
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("iotest/dog.jpg");
			fos = new FileOutputStream("iotest/dog3.jpg");
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			long end = System.currentTimeMillis();
			System.out.println("파일 저장 완료...");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if(bis != null) {
				try {
					bis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}








