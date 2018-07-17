package kr.co.mlec.day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//rena.jpg ==> rena2.jpg 복사
/*
	작업순서
	1. stream open
	2. 작업수행(input/output)
	3. stream close
	열고 닫으면됨
	//io관련 클래스는 다 체크드 익셉션이다 trycatch하자
*/

public class FileMain02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// 1. stream open
			fis = new FileInputStream("io/rena.jpg");
			fos = new FileOutputStream("io/rena2.jpg");
			//파일이 없어도 생성해줌 + 덮어쓰기
			//하지만 이대로는 빈파일만 생김
			
			long start = System.currentTimeMillis();
			// 2. 작업수행(read/write)
			while(true) {
				int c = fis.read();
				if(c==-1) break; 
				fos.write(c);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사!" + ((end-start)/1000.) + "sec");
		} catch (Exception e) {
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
		}//스트림을 닫지 않으면 io클래스에서 사용중인 파일의 억세스가 거부된다
		//열었으면 꼭 닫아
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
