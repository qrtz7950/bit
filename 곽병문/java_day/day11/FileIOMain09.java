package kr.co.mlec.day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kr.co.mlec.Util.FileClose;

public class FileIOMain09 {

	public static void write(List list) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("D:\\Lecture\\java\\iotest\\UserVO.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
			System.out.println("UserVO.txt에 저장완료...");
			
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
			fis = new FileInputStream("D:\\Lecture\\java\\iotest\\UserVO.txt");
			ois = new ObjectInputStream(fis);
			
			List<UserVO> list = (List<UserVO>)ois.readObject();
			System.out.println("파일 읽기 완료...");
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
						
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(ois);
			FileClose.close(fis);
		}
	}
	
	public static void main(String[] args) {
		
		List<UserVO> list = new ArrayList<>();
		list.add(new UserVO("홍길동", "010-1111-2222", "서울시 서초구"));
		list.add(new UserVO("고길동", "010-3333-4444", "경기도 성남시 분당구"));
		list.add(new UserVO("최길동", "010-5555-6666", "서울시 강남구 압구정동"));
		
		write(list);
		read();
	}

}
