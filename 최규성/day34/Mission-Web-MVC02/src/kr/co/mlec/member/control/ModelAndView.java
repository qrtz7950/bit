package kr.co.mlec.member.control;
/*
 *  Model: 화면단(JSP)에서 사용할 데이터의 저장객체(request공융영역에 등록시킬 객체)
 *  View : 응답할 JSP정보 저장
 */

import java.util.HashMap;
import java.util.Map;

public class ModelAndView {

	private Map<String, Object> model;
	private String view;
	
	public ModelAndView() {
		model = new HashMap<>();
	}

	public ModelAndView(String view) {
		this();	//동일한 생성자 호출할때 쓰기위함
		this.view = view;
	}

	public Map<String, Object> getModel() {
		return model;
	}

	public void setModel(Map<String, Object> model) {
		this.model = model;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}
	
	public void addAttribute(String key, Object value) {
		model.put(key,value);
	}
	
}
