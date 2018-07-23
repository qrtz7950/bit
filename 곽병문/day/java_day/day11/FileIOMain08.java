package kr.co.mlec.day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.co.mlec.Util.FileClose;

public class FileIOMain08 {

	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 20, "서울시 서초구");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/object.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			
			System.out.println("object.txt에 저장완료...");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(oos);
			FileClose.close(fos);
		}
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/object.txt");
			ois = new ObjectInputStream(fis);
			
			UserInfo user = (UserInfo)ois.readObject();
			System.out.println("파일 읽기 완료...");
			System.out.println(user);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(ois);
			FileClose.close(fis);
		}
	}
	
	public static void main(String[] args) {
		
		write();
		
		read();

	}

}
