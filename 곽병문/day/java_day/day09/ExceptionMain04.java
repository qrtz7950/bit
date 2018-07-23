package kr.co.mlec.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionMain04 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("a.txt");
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			try {
				FileWriter fw = new FileWriter("error.log");
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

}
