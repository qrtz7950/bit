package kr.co.mlec;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HandlerMapping {

	private Map<String, Controller> mappings = null;
	
	public HandlerMapping(String propName) {
		mappings = new HashMap<>();
		
		Properties prop = new Properties();
		
		try(
			InputStream inStream = new FileInputStream(propName); 
		){			
			prop.load(inStream);
			
			Set<Object> keys = prop.keySet();
			for(Object key : keys) {
				String className = prop.getProperty(key.toString());
				
				Class<?> clz = Class.forName(className);
				mappings.put(key.toString(), (Controller)clz.newInstance());
				
			//	mappings.put(key.toString(), new ListController());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Controller getController(String uri) {
		
		return mappings.get(uri);
	}
	
	/*public static void main(String[] args) throws Exception {
		
		Class<?> clz = Class.forName("java.util.Random");
		
		java.util.Random r = (java.util.Random)clz.newInstance(); //이런식으로 메소드의 이름으로 객체를 만들어 사용할수있게된다
		System.out.println("추출된 난수 : " + r.nextInt(100));
	}*/
}
