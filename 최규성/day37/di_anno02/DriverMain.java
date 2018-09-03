package di_anno02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 
 * 스프링을 이용한 DI - @Resource 어노테이션을 이용한 자동주입
 * 
 * @Resource 사용가능위치 : 멤버변수, setter메소드
 */

public class DriverMain {

	public static void main(String[] args) {
		
	//	ApplicationContext context = new GenericXmlApplicationContext("di_anno02.xml");
	//	ApplicationContext context = new GenericXmlApplicationContext("di_anno02-1.xml");
		ApplicationContext context = new GenericXmlApplicationContext("di_anno02-2.xml");
		
		Car car = context.getBean("car", Car.class);
		System.out.println(car.getTireBrand());
	}
}














