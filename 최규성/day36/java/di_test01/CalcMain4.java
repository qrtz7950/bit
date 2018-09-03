package di_test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalcMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MyCalculator my = new MyCalculator();
//		Calculator calculator = new Calculator();
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("di_test01_04.xml");
		
		MyCalculator my = context.getBean("myCalculator", MyCalculator.class);
		
		my.setFirstNum(10);
		my.setSecondNum(3);
		
		my.add();
		my.sub();
		my.mul();
		my.div();
	}

}
