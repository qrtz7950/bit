package kr.co.mlec.homework.homework07;

public class Triangle extends Calc {

	@Override
	public void calc() {
		int b = r.nextInt(9) + 1;
		System.out.println("삼각형의 넓이는 " + a*b/2 + " 입니다");
	}

}
