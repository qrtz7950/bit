package kr.co.mlec.day11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
	
		File dirObj = new File("iotest");
		
		System.out.println(dirObj.exists() ? "유효한 디렉토리입니다" : "유효하지 않은 디렉토리입니다");
		System.out.println(dirObj.isDirectory() ? "디렉토리입니다" : "디렉토리가 아닙니다");
		
		String[] list = dirObj.list();
		System.out.println("------------------------------------------");
		System.out.println("\t\t" + dirObj.getName() + " 디렉토리 정보");
		System.out.println("------------------------------------------");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("------------------------------------------");
		
		File newDirObj = new File("iotest/닭/오리");
//		System.out.println(newDirObj.exists() ? "존재합니다" : "존재하지 않습니다");
		boolean bool = false;
		if(!newDirObj.exists()) {
			bool = newDirObj.mkdir();
			System.out.println(bool ? "생성 성공" : "생성 실패");
		}
		
		newDirObj = new File("iotest/새폴더/오리");
		if(!newDirObj.exists()) {
			bool = newDirObj.mkdirs();
			System.out.println(bool ? "생성 성공" : "생성 실패");
		}
		
		bool = newDirObj.delete();
		System.out.println(bool ? "삭제성공" : "삭제실패");
		
/*		
//		File fileObj = new File("D:/Lecture\\java-workspace\\java\\iotest\\a.txt");
		File fileObj = new File("iotest/a.txt");
		
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
		
		System.out.println("파일명 : " + fileName);
		System.out.println("부모이름 : " + parent);
		System.out.println("경로 : " + path);
		
		boolean bool = fileObj.isFile();
		System.out.println(bool ? "파일입니다" : "파일이 아닙니다");
		
		bool = fileObj.isDirectory();
		System.out.println(bool ? "디렉토리입니다" : "디렉토리가 아닙니다");
		
		bool = fileObj.exists();
		System.out.println(bool ? "존재합니다" : "존재하지 않습니다");
		
		long length = fileObj.length();
		System.out.println("파일크기 : " + length + "byte(s)");
		
		long time = fileObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("마지막 수정 날짜 : " + sdf.format(new Date(time)));
		
		bool = fileObj.canRead();
		System.out.println(bool ? "읽기 가능" : "읽기 불가능");
		
		bool = fileObj.canWrite();
		System.out.println(bool ? "쓰기 가능" : "쓰기 불가능");
*/		
	}
}







