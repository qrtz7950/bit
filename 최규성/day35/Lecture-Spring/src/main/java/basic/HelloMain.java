package basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloMain {

	public static void main(String[] args) {
		
	//	Hello hello = new Hello();
	//	hello.prnMsg();
		
	//	Resource resource = new ClassPathResource("beanContainer.xml");
		Resource resource = new FileSystemResource("src/main/resources/beanContainer.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Hello obj = (Hello)factory.getBean("hello"); //id가 hello인 객체로 만들고 그것을 갖고온다
		obj.prnMsg();
		
		Hello obj2 = (Hello)factory.getBean("hello2");
		obj2.prnMsg();
		
		Hello obj3 = (Hello)factory.getBean("hello"); //하나의 클래스에서 만든 한개의 객체이기 때문에 바로 갖고올수있다(싱글톤패턴)
		obj3.prnMsg();
		
	}
}
