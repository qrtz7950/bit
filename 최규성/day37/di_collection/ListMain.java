package di_collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ListMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di_test.xml");
		ListAddress list = context.getBean("list", ListAddress.class);
		
		for(String addr : list.getAddress()) {
			System.out.println(addr);
		}
		
		MapAddress map  = context.getBean("map", MapAddress.class);
		
		Map<String, String> address = map.getAddress();
		
		Set<Entry<String, String>> entry = address.entrySet();
		for(Entry<String, String> e : entry) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}
