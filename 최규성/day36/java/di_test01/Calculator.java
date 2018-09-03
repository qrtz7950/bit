package di_test01;

public class Calculator {

	
	public void addition(int firstNum, int secondNum) {
		System.out.println("덧셈 결과: " + firstNum + "+" + secondNum + "=" + (firstNum+secondNum));
	}
	public void subtraction(int firstNum, int secondNum) {
		System.out.println("뺄셈 결과: " + firstNum + "-" + secondNum + "=" + (firstNum-secondNum));
	}
	public void multiplecation(int firstNum, int secondNum) {
		System.out.println("덧셈 결과: " + firstNum + "*" + secondNum + "=" + (firstNum*secondNum));
	}
	public void division(int firstNum, int secondNum) {
		System.out.println("덧셈 결과: " + firstNum + "/" + secondNum + "=" + (firstNum/secondNum));
	}
}
