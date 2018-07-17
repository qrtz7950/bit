package kr.co.mlec.day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.co.mlec.util.FileClose;

// FIleIOMain03.java ==< FileIOMain03_1.java.txt
public class FileIOMain06 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIoMain03_1.java.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				bw.write(str);
				bw.newLine();
			}
			bw.flush();
			
			/*
			while(true) {
				int c = br.read();
				if(c == -1) {
					break;
				}
				bw.write(c);
			}
			bw.flush();
			*/
			
			System.out.println("복사를 완료하였습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
			FileClose.close(bw, fw);
		}
	}
}















