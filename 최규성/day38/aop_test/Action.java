package aop_test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class Action {

	@Before("execution(void *.work())")
	public void gotoOffice() {
		System.out.println("출근을 합니다");
	}
	
	@After("execution(void *.work())")
	public void getoffOffice() {
		System.out.println("퇴근을 합니다");
	}
}
