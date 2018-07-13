package day09.exam;

public class DogMain {

	public static void main(String[] args) {

		/*
		Dog d  = new Dog();
		Dog d2 = new Dog();
		*/
		
		Dog d= Dog.getInstance();
		Dog d2= Dog.getInstance();
		
		System.out.println("d: "+ d);
		System.out.println("d2: "+ d2);
	}

}
