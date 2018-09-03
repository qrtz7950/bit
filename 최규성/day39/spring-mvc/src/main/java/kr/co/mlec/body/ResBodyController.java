package kr.co.mlec.body;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.mlec.form.MemberVO;

@Controller
@RequestMapping("/ajax")
public class ResBodyController {
	
	@RequestMapping("/resBody.json")
	@ResponseBody						//jsp로 forward하지않고 바로 출력하는 어노테이션
	public Map<String, String> resStringBody() {
		Map<String, String> result = new HashMap<>();
		result.put("id", "hong");
		result.put("name", "홍길동");
		result.put("addr", "서울");
		return result;
	}
	
	@RequestMapping("/resVOBody.json")
	@ResponseBody
	public MemberVO resJsonVOBody() {
		
		MemberVO member = new MemberVO();
		member.setId("hong");
		member.setName("홍길동");
		member.setPassword("123");
		
		return member;
	}
	
	@ResponseBody
	@RequestMapping("/resStringListBody.json")
	public List<String> resJsonStringListBody(){
		
		List<String> list = new ArrayList<>();
		
		for(int i = 1; i <= 4; i++) {
			list.add(String.valueOf(i));
		}
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/resVOListBody.json")
	public List<MemberVO> resJsonVOListBody(){
		
		List<MemberVO> list = new ArrayList<>();
		
		for(int i = 1; i <=4; i++) {
			MemberVO member = new MemberVO();
			member.setId("hong" + i);
			member.setPassword("0000");
			member.setName("홍길동" + 1);
			
			list.add(member);
		}
		
		return list;
	}

}
