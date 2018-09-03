package aop_test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class LogAspect {

	@Before("execution(public * *.*())")
	public void start(JoinPoint joinPoint) {
		System.out.println("[로그시작]-----------------------------------------");
	}
	
	@After("execution(public * *.*())")
	public void end(JoinPoint joinPoint) {
		System.out.println("[로그종료]------------------------------------------");
	}
}
