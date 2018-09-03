package aop02;

import org.aspectj.lang.JoinPoint;

public class MyAspect {

	public void before(JoinPoint joinPoint) {
		System.out.println("열쇠로 문을 열고 집으로 들어옵니다.");
	}

	public void after(JoinPoint joinPoint) {
		System.out.println("불을 끄고 잠을 잡니다.");
	}
	
	
}
