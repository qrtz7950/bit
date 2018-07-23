package kr.co.mlec.day09;

import java.io.FileReader;

abstract class Parent{
	abstract void a();
	abstract void b() throws Exception;
}

class Child extends Parent{

	@Override
	void a() {
		
	}
	
	@Override
	void b() throws Exception{
		
	}
	
}

public class ExceptionMain05 {

	static void a() {
		System.out.println("a() start");
		try {
			System.out.println(1/0);;
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("a() end");
	}
	
	static void b() throws Exception{
		System.out.println("b() start");
		
		int[] arr = new int[5];
		System.out.println(arr[5]);
		
		FileReader fr = new FileReader("a.text"); 
		
		System.out.println("b() end");
	}
	
	public static void main(String[] args) {
		
		a();
		try {
			b();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
