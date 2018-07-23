package kr.co.mlec.homework.homework07;

public class Circle extends Calc {

	@Override
	public void calc() {
		System.out.println("원의 넓이는 " + (int)(super.a*super.a*3.14) + " 입니다");
	}

}
