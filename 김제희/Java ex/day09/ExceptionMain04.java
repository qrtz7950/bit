package kr.co.mlec.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		//FileReader fr = new FileReader("a.txt");
		//램이 아닌 하드디스크에서 파일을 읽어오므로 예외가 발생할 확률이 매우 높다
		//이런 확률이 높은 에러에 대해서는 자바에서 예외처리를 해야한다고 컴파일 시점에서 예외처리
		
		try {
			FileReader fr = new FileReader("a.txt");
		} catch(FileNotFoundException fnfe) {
//			fnfe.printStackTrace();
//			오류를 단지 출력하는것이 아니라 log파일로 저장하고싶다
//			try catch문 안에 try catch문 중첩이 가능하다
			try {
				FileWriter fw = new FileWriter("error.log");
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	}
}
