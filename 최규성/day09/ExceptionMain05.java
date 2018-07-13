package day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

abstract class Parent{
	abstract void a(); 
	abstract void b() throws Exception;
}

class Child extends Parent{
	@Override
	void a() {
		
	}
	@Override
	void b() throws Exception {
		
	}
	
}

public class ExceptionMain05 {

	static void a() {
		System.out.println("a() start");
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("a() end");
	}

	// static void b() throws FileNotFoundException ,ArrayIndexOutOfBoundsException{
	static void b() throws Exception { //쓰로우즈를 쓰면 트라이캐치를 매번 안써도 됨

		System.out.println("b() start");

		int[] arr = new int[5];
		System.out.println(arr[5]);

		FileReader fr = new FileReader("a.txt");

		System.out.println("b() end");
	}

	public static void main(String[] args) {

		System.out.println("main start...");
		a();
		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main end...");

	}

}
