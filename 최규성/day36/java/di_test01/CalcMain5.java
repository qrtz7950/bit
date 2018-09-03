package di_test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalcMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Calculator calculator = new Calculator();
//		MyCalculator my = new MyCalculator(calculator);
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("di_test01_05.xml");
		
		MyCalculator my = context.getBean("myCalculator", MyCalculator.class);
	
		my.add();
		my.sub();
		my.mul();
		my.div();
		
	}
}
