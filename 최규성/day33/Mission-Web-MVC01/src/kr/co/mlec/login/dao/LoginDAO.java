package kr.co.mlec.login.dao;

import java.util.HashMap;
import java.util.Map;

import kr.co.mlec.login.vo.LoginVO;

public class LoginDAO {

	public LoginVO login(LoginVO loginVO) {
		LoginVO userVO = null;
		
		//DB대체 data
		Map<String, String> memberList = new HashMap<>();
		memberList.put("admin", "123");
		memberList.put("user", "123");

		
		String password = memberList.get(loginVO.getId());
		
		if(password != null && loginVO.getPassword().equals(password)) {
			//로그인 성공
			userVO = new LoginVO(loginVO.getId(),password);
		//	userVO.setId(loginVO.getId());
		//	userVO.setPassword(password);
		}
		
		return null;
	}
}
