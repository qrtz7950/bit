package aop_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("aop_test.xml");
		
	}

}
