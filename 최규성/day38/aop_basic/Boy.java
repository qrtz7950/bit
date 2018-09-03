package aop_basic;

public class Boy {

	public void runSomething() {
		MyAspect.beforeRunSomething();
		
		System.out.println("컴퓨터게임을 합니다.");
		
		MyAspect.afterRunSomething();
	}
}
