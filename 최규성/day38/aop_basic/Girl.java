package aop_basic;

public class Girl {

	public void runSomething() {
		MyAspect.beforeRunSomething();
		
		System.out.println("화장을 지운다.");
		
		MyAspect.afterRunSomething();
	}
}
