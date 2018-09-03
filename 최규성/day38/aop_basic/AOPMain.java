package aop_basic;
/*
 * 전처리 없이 서비스가 공통된 구문을 포함
 */
public class AOPMain {

	public static void main(String[] args) {

		Girl girl = new Girl();
		Boy boy = new Boy();
		
		girl.runSomething();
		boy.runSomething();
	}

}
