package di_anno01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 스프링을 이용한 DI - @Autowired 어노테이션을 이용한 자동 주입 방식
 * 
 * xml추가태그
 * <context:annotation-config />
 * 
 * 
 */

public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di_anno01-2.xml");
		
		Car car = context.getBean("car", Car.class);
		System.out.println(car.getTireBrand());
	}

}
