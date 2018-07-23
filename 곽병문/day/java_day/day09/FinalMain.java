package kr.co.mlec.day09;

/*final*/ class Super{
	/*final*/ void print() {
		System.out.println("SUUUUUUUPEER!");
	}
	
}

class Sub extends Super{
	@ Override
	void print() {
		System.out.println("Sub..¤¾");
	}
}

public class FinalMain {

	public static void main(String[] args) {
		
		final double PI = 3.14;

	}

}
