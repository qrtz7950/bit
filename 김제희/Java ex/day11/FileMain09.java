package kr.co.mlec.day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kr.co.mlec.util.FileClose;

public class FileMain09 {

	static List<UserVO> list = new ArrayList<>();
	
	 public static void write() {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("io/UserVO.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
			System.out.println("UserVO.txt에 저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos);
			FileClose.close(fos);
		}
	}
	
	public static void read() {
		
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	
	try {
		fis = new FileInputStream("io/UserVO.txt");
		ois = new ObjectInputStream(fis);
		
		list = (List<UserVO>)ois.readObject();
		
		System.out.println("파일 읽기 완료...");
		System.out.println(list);
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		FileClose.close(ois);
		FileClose.close(fis);
	}
	}


	public static void main(String[] args) {
		
		list.add(new UserVO("홍길동", "010-1111-2222", "서울시 서초구"));
		list.add(new UserVO("고길동", "010-3333-4444", "경기도 성남시 분당구"));
		list.add(new UserVO("최길동", "010-5555-6666", "서울시 강남구 압구정동"));
		
		write();
		read();
		
	}
}
