package kr.co.mlec.day11;

import java.io.Serializable;

public class UserVO implements Serializable{
	
	private String name;
	private String phone;
	private String addr;
	
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", phone=" + phone + ", addr=" + addr + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public UserVO(String name, String phone, String addr) {
		super();
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	
}
