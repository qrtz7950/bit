package kr.co.mlec.day11;

import java.io.FileReader;
import java.io.FileWriter;

import kr.co.mlec.util.FileClose;

// FileMain05를 io에 위치한 fileIOMain03으로 봇ㄱ사

public class FileMain05 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("io/FileMain03.java");
			fw = new FileWriter("io/FileMain03.java.txt" , true); //뒤에 불린형 추가하여 확장기능 사용 제어가능
			
			while(true) {
				int c = fr.read();
				if(c==-1) break;
				fw.write(c);
			}
			fw.flush();
			
			System.out.println("파일저장을 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(fr);
			FileClose.close(fw);
			
			/*			
			if(fr != null) {
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
			}
*/
		}
	}
}







