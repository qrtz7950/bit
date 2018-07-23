package kr.co.mlec.day09.singleton;

public class DogMain {

	public static void main(String[] args) {
		
		Dog d = Dog.getInstance();
		Dog d2 = Dog.getInstance();
		
		System.out.println("d : " + d);
		System.out.println("d2 : " +d2);
		

	}

}
