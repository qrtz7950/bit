package di_test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MyCalculator my = new MyCalculator();
//		Calculator calculator = new Calculator();
		
		ApplicationContext context 
			= new GenericXmlApplicationContext("di_test01_01.xml");
		
		MyCalculator my = (MyCalculator)context.getBean("myCalculator");
		Calculator calculator = (Calculator)context.getBean("calculator");
		
		my.setFirstNum(10);
		my.setSecondNum(3);
		my.setCalculator(calculator);
		
		my.add();
		my.sub();
		my.mul();
		my.div();
	}

}
