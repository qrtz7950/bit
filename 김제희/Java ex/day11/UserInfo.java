package kr.co.mlec.day11;

import java.io.Serializable;

/*
 *  기본생성자 		: Alt + Shift + s -> c 
 *  매개변수생성자 		: Alt + Shift + s -> o
 *  getter/setter	: Alt + Shift + s -> r
 *  toString		: Alt + Shift + s -> s
 *  override 구현 	: Alt + Shift + s -> v
 *  override 구현 	: Alt + Shift + s -> v
 */

public class UserInfo implements Serializable {
	
	private String 	name;
	private transient int 	age;
	private String 	addr;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
}
