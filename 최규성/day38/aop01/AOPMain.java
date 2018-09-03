package aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * Spring AOP의 특징
 * 1. 프록시 기반
 * 2. 인터페이스 기반(핵심코드를 갖는 서비스(Girl, Boy)는 인터페이스 기반으로 만들어야함)
 * 3. 런타임 기반
 * 
 */
public class AOPMain {

	public static void main(String[] args) {

		ApplicationContext context  = new GenericXmlApplicationContext("aop01.xml");
		
		Person girl = context.getBean("girl",Person.class);
		girl.runSomething();
		
		Person boy  = context.getBean("boy", Person.class);
		boy.runSomething();
		
		}

}
