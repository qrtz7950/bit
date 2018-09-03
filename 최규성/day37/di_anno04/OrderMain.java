package di_anno04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class OrderMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("di_anno04.xml");
		
		OrderManager m = context.getBean("orderManager", OrderManager.class);
	}

}
