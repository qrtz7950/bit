package kr.co.mlec.day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.co.mlec.util.FileClose;

public class FileMain08 {

	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 20, "서울시 서초구");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("io/object.txt");
			oos = new ObjectOutputStream(fos);
			
			//객체를 바이트 스트림에 직렬화시켜주는 인터페이스를 상속받아야한다
			//객체에 implements Serializable를 상속받아야함
			oos.writeObject(user);
			
			System.out.println("object.txt에 저장완료...");
			
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
			fis = new FileInputStream("io/object.txt");
			ois = new ObjectInputStream(fis);
			
			UserInfo user = (UserInfo)ois.readObject();
			System.out.println("파일 읽기 완료...");
			System.out.println(user);
			//객체 클래스 멤버변수에 transient라는 키워드를  쓰면 직렬화에서 제외된다
			//비밀번호같은 민감한 멤버변수에 사용된다
			//ex)private transient int age;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(ois);
			FileClose.close(fis);
		}
	}
	
	
	public static void main(String[] args) {
		
		write();
		read();
	}
}
