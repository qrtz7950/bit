package aop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

	@Before("execution(void aop01.Girl.runSomething())")	//~어느 시점에 ~을 실행하겠다는 의미(Girl이 나오기전에 실행)
	public void before(JoinPoint joinPoint) {
		System.out.println("열쇠로 문을 열고 집으로 들어옵니다.");
	}
	@After("execution(* runSomething())")
	public void after(JoinPoint joinPoint) {
		System.out.println("불을 끄고 잠을 잡니다.");
	}
	
	@Around("execution(* runSomething())")	//@Around를 써서 실행 전,후와 중간에 실행위치를 설정한다
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("불을 켭니다.");
		joinPoint.proceed();
		System.out.println("문단속을 합니다.");	//aro - bef - aro - aft
	}
	 	
	
	
	/*@Pointcut("execution(* runSomething())")
	public void pointCut() {
		
	}
	@Before("pointCut()")	//~어느 시점에 ~을 실행하겠다는 의미(Girl이 나오기전에 실행)
	public void before(JoinPoint joinPoint) {
		System.out.println("열쇠로 문을 열고 집으로 들어옵니다.");
	}
	@After("pointCut()")
	public void after(JoinPoint joinPoint) {
		System.out.println("불을 끄고 잠을 잡니다.");
	}
	*/
}
