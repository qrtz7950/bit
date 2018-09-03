package aop03;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AOPMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("aop03.xml");
		
		Human man = context.getBean("man", Human.class);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3 ; i++) {
			System.out.println("나이를 입력하세요: ");
			int age = sc.nextInt();
			man.setAge(age);
		}
	}

}
