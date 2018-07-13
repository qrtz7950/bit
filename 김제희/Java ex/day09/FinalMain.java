package kr.co.mlec.day09;

/*final*/ class Super{ //final 붙일 시 상속불가
	void print() { //final 붙일 시 오버라이드 불가
		System.out.println("쑤퍼어어어어얼");
	}
}

class Sub extends Super{
	@Override
	void print() {
		System.out.println("써어어어어얼브");
	}
}

public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
