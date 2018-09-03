package di_xml01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 스프링을 이용한 DI: 속성주입방식(setter주입)
 * 
 * - 쇼핑몰에서 타이어 구입
 * - 쇼핑몰에서 자동차 구입
 * - 운전자가 직접 자동차에 타이어 장착
 * 
 */
public class DriverMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("di_xml01.xml");
		
	//	KoreaTire tire = (KoreaTire)context.getBean("koreatire");	//쇼핑몰에서 한국타이어,
	//	NexenTire tire = (NexenTire)context.getBean("nexentire");	//쇼핑몰에서 넥센타이어,
		Tire tire = (Tire)context.getBean("koreatire");				//쇼핑몰에서 Tire형으로 id만 부른후,
		
		Car car = (Car)context.getBean("car");					//자동차 구입
		
		car.setTire(tire);									//타이어 장착
		
		System.out.println(car.getTireBrand());
		
	}

}
