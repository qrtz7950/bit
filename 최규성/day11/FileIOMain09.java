package day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileIOMain09 {

	public static void write() {
		List<UserVO> list = new ArrayList<>();
		list.add(new UserVO("홍길동", "010-1111-2222", "서울시 서초구"));
		list.add(new UserVO("고길동", "010-3333-4444", "경기도 성남시 분당구"));
		list.add(new UserVO("최길동", "010-5555-6666", "서울시 강남구 압구정동"));
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("io/user.txt");
			oos = new ObjectOutputStream(fos);
			
			/*
			for(int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i));
			}
			*/
			
			oos.writeObject(list);
			
			oos.flush();
			System.out.println("파일 저장을 완료하였습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos);
			FileClose.close(fos);
		}
	}
	
	public static void read() throws Exception {
		
		FileInputStream fis = new FileInputStream("iotest/user.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<UserVO> list = (ArrayList<UserVO>)ois.readObject();
		
		FileClose.close(ois);
		FileClose.close(fis);
		
		System.out.println("< 회원정보 출력 >");
		for(UserVO user : list) {
			System.out.println(user);
		}
	}
	
	public static void main(String[] args) {
		
//		write();
		
		try {
			read();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
