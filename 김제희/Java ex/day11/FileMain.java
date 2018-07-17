package kr.co.mlec.day11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {

		File dirObj = new File("io");
		
		System.out.println(dirObj.isDirectory() ? "디렉토리입니다" : "디렉토리가 아닙니다");
		
		String[] list = dirObj.list();
		System.out.println("------------------------------------------");
		System.out.println("\t\t" + dirObj.getName() + " 디렉토리 정보");
		System.out.println("------------------------------------------");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("------------------------------------------");
		
		File newDirObj = new File("io/님버드/님버드헤드");
		boolean bool = false;
		System.out.println(dirObj.exists() ? "유효한 디렉토리입니다" : "유효하지 않은 디렉토리입니다");
		if(!newDirObj.exists()) {
			bool = newDirObj.mkdir();
			System.out.println(bool ? "버드탄생" : "뭐왜뭐뭐뭐뭐뭐무머");
		}
		
		newDirObj = new File("io/버버드/님버드헤드");
		bool = false;
		if(!newDirObj.exists()) {
//			bool = newDirObj.mkdir(); //해당 메소드는 디렉토리 최종단에만 만들수있기때문에 님버드헤드 이전의 디렉토리는 존재해야한다
			bool = newDirObj.mkdirs(); //mkdirs메소드로 한방에 만들수있다
			System.out.println(bool ? "버드탄생" : "뭐왜뭐뭐뭐뭐뭐무머");
		}
		
		bool = newDirObj.delete();
		System.out.println(bool ? "삭제성공" : "삭제실패");
		//이 메소드도 최종단만 삭제가능 디렉토리있는거 통채로 삭제
		//삭제해서 비어있는경우 성공으로 판단 
		
		
/*		
//		File fileObj = new File("D:\\Lecture\\java\\io\\a.txt");
//		File fileObj = new File("D:/Lecture/java/io/a.txt"); 
//		역슬래쉬 두개 = 슬래쉬 한개
		File fileObj = new File("io/a.txt"); 
		//상대경로도 가능
		
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
		
		System.out.println(fileName);
		System.out.println(parent);
		System.out.println(path);
		
		boolean bool = fileObj.isFile();
		System.out.println(bool ? "파일입니다" : "파일이 아닙니다");
		
		bool = fileObj.isDirectory();
		System.out.println(bool ? "디렉토리입니다" : "디렉토리가 아닙니다");
		
		bool = fileObj.exists();
		System.out.println(bool ? "존재" : "존재X");
		//존재여부를 먼저 판별한 뒤 파일인지 디렉토리인지 구분하면된다
		
		long length = fileObj.length();
		System.out.println("파일 크기" + length + "byte(s)");
		
		long time = fileObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		System.out.println("마지막으로 수정된시간: " + sdf.format(new Date(time)));
		
		bool = fileObj.canRead();
		System.out.println(bool ? "읽기 가능" : "읽기 불가능");
		
		bool = fileObj.canWrite();
		System.out.println(bool ? "쓰기 가능" : "쓰기 불가능");
		
		//파일 객체는 파일의 정보를 볼뿐 바이트스트림 문자스트림을 이용하지않으면 내용은 볼수 없다
*/		
	}

}
