package kr.co.mlec.day11;

import java.io.FileReader;
import java.io.FileWriter;

import kr.co.mlec.util.FileClose;

// iotest/FileIOMain03.java --> iotest/FileIOMain03.java.txt 복사
public class FileIOMain05 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIOMain03.java.txt");
			
			while(true) {
				int c = fr.read();
				if(c == -1) {
					break;
				}
				fw.write(c);
			}
			fw.flush();
			System.out.println("파일 저장을 완료하였습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(fr, fw);
			
//			FileClose.close(fr);
//			FileClose.close(fw);
			
			/*if(fr != null) {
				try {
					fr.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}*/
		}
	}
}














