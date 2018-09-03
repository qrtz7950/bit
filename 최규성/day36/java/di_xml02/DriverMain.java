package di_xml02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 스프링을 이용한 DI: 속성주입방식(setter주입)
 * 
 * - 쇼핑몰에서 타이어 구입
 * - 쇼핑몰에서 자동차 구입
 * - 쇼핑몰에서 사용자가 주문한 타이어를 자동차에 장착
 * - 쇼핑몰이 사용자에게 완성품 자동차를 전달
 * 
 */
public class DriverMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("di_xml02.xml");
		
		Car car = (Car)context.getBean("car");
		System.out.println(car.getTireBrand());
		
	}

}
