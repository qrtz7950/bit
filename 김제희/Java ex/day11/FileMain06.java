package kr.co.mlec.day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.co.mlec.util.FileClose;

// FileMain05를 io에 위치한 fileIOMain03으로 봇ㄱ사

public class FileMain06 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("io/FileMain03.java");
			fw = new FileWriter("io/FileMain03.java.txt" , true); //뒤에 불린형 추가하여 확장기능 사용 제어가능
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String str = br.readLine();
				if(str==null) break;
				bw.write(str);
//				bw.write("\n");//라인 입력이기때문에 엔터를 입력해야하나 os마다 엔터를 나타내는 문자가 다르기때문에
				bw.newLine();//이 메소드를 입력하여 엔터를 친다
			}
			bw.flush();
			
			System.out.println("파일복사을 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br);
			FileClose.close(bw);
			FileClose.close(fr);
			FileClose.close(fw);
		}
	}
}







