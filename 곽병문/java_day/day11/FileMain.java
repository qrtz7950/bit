package kr.co.mlec.day11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		
		
		File dirobj = new File("iotest");
		
		System.out.println(dirobj.exists() ? "유효한 디렉토리입니다" : "유효하지 않은 디렉토리입니다");
		System.out.println(dirobj.isDirectory() ? "디렉토리입니다" : "디렉토리가 아닙니다");
		
		String[] list = dirobj.list();
		System.out.println("------------------------------------------------");
		System.out.println("\t\t" + dirobj.getName() + "디렉토리 정보");
		System.out.println("------------------------------------------------");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("------------------------------------------------");
		
		File newDirobj = new File("iotest\\닭\\오리");
		System.out.println(newDirobj.exists() ? "존재합니다" : "존재하지 않습니다");
		
		boolean bool = false;
		if(!newDirobj.exists()) {
			bool = newDirobj.mkdir();
			System.out.println(bool ? "생성 성공" : "생성 실패");
		}
		
		newDirobj = new File("iotest\\새폴더\\오리");
		if(!newDirobj.exists()) {
//			bool = newDirobj.mkdir();		// 위 경로가 맞지 않으면 생성 불가
			bool = newDirobj.mkdirs();		// 경로 안맞아도 다 만들어버리기
			System.out.println(bool ? "생성 성공" : "생성 실패");
		}
		
		bool = newDirobj.delete();			// 마지막 부분만 삭제
		System.out.println(bool ? "삭제 성공" : "삭제 실패");
		
/*		
		File fileobj = new File("D:\\Lecture\\java\\iotest\\a.txt");
//		File fileobj = new File("iotest\\a.txt");
		
		String fileName = fileobj.getName();
		String parName = fileobj.getParent();
		String path = fileobj.getPath();
		
		System.out.println("파일명 : " + fileName);
		System.out.println("부모이름 : " + parName);
		System.out.println("파일경로 : " + path);
		
		boolean bool = fileobj.isFile();
		System.out.println(bool ? "파일입니다" : "파일이 아닙니다");
		bool = fileobj.isDirectory();
		System.out.println(bool ? "디렉토리입니다" : "디렉토리가 아닙니다");
		
		bool = fileobj.exists();
		System.out.println(bool ? "존재합니다" : "존재하지 않습니다");
		
		long length = fileobj.length();
		System.out.println("파일 크기는 " + length + "byte(s)");
		
		long time = fileobj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("마지막 수정 날짜" + sdf.format(new Date(time)));
		
		bool = fileobj.canRead();
		System.out.println(bool ? "읽기 가능" : "읽기 불가능");
		
		bool = fileobj.canWrite();
		System.out.println(bool ? "쓰기 가능" : "쓰기 불가능");
*/
	}

}
