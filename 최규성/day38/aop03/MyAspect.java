package aop03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MyAspect {

	@After("execution(* setAge(..))")
	public void checkAdult(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		
		int age = (int)args[0];
		
		if(age >= 20) {
			System.out.println("성인");
		 } else {
			 System.out.println("급식");
		 }
		
	}
	
	@Around("execution(* setAge(..))")
	public void checkAdult2(ProceedingJoinPoint joinPoint) throws Throwable{
		joinPoint.proceed();
		
		Object obj = joinPoint.getTarget();
		
		if(obj instanceof Man) {
			Man man = (Man)obj;
			int age = man.getAge();
			
			if(age >= 20) {
				System.out.println("성년입니다");
			} else {
				System.out.println("미성년입니다");
			}
		}
	}
}
