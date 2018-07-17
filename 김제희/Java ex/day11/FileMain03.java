package kr.co.mlec.day11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 버퍼사용 스트림이용
 */

public class FileMain03 {
	
	public static void main(String[] args) {
	
	FileInputStream fis = null;
	FileOutputStream fos = null;
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;
	
	try {
		fis = new FileInputStream("io/rena.jpg");
		fos = new FileOutputStream("io/rena3.jpg");
		
		bis = new BufferedInputStream(fis);
		bos = new BufferedOutputStream(fos);
		
		long start = System.currentTimeMillis();
		while(true) {
			int c = bis.read();
			if(c==-1) break; 
			bos.write(c);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("복사!" + ((end-start)/1000.) + "sec");
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if(bis != null) {
			try{
				bis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(bos != null) {
			try {
				bos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
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
