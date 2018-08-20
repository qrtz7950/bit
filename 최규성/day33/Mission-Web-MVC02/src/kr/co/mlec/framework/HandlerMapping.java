package kr.co.mlec.framework;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import kr.co.mlec.framework.annotation.RequestMapping;
/*
 * key : uri
 * value : controller + method	//이 두개를 다 알고있는 클래스가 필요하다 CtrlAndMethod
 */

public class HandlerMapping {

	private Map<String, CtrlAndMethod> mappings;
	
	public HandlerMapping(String ctrlNames) throws Exception{
		mappings = new HashMap<>();
		String[] ctrls = ctrlNames.split("\\|");	//value2개를 |를 기준으로 나눔
		System.out.println(Arrays.toString(ctrls));
		
		for(String ctrl : ctrls) {
			ctrl = ctrl.trim();
			Class<?> clz = Class.forName(ctrl);
			
			Object target = clz.newInstance();
			
			Method[] methods = clz.getMethods();
	//		Method[] methods = clz.getDeclaredMethod(); //상속받은것까지 출력하는 차이
			for(Method method : methods) {
		//		System.out.println(method.getName());
				RequestMapping reqAnno = method.getAnnotation(RequestMapping.class);
		//		System.out.println(method + " : " + reqAnno);
				
				if(reqAnno != null) {
					String uri = reqAnno.value();
					mappings.put(uri,new CtrlAndMethod(target, method));
					System.out.println(uri);
					System.out.println(target);
					System.out.println(method);
				}
			}
		}
	}
	
	public CtrlAndMethod getCtrlAndMethod(String uri) {
		return mappings.get(uri);
	}
}
