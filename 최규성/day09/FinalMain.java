package day09;
/*final*/ class Super {
	
	/*final*/ void print() {
		System.out.println("SUPER...");
	}
}

class Sub extends Super{
	@Override
	void print() {
		System.out.println("SUB....");
	}
}
public class FinalMain {

	public static void main(String[] args) {

		/*final */double pi = 3.14;
		
		pi = 3.141592;
	}

}
