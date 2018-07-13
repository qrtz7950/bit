package day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain04 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("a.txt");
		} catch (FileNotFoundException fnfe) {
			// fnfe.printStackTrace(); //
			try {
				FileWriter fw = new FileWriter("error.log"); // 에러를 로그파일로 저장하는 경우
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
