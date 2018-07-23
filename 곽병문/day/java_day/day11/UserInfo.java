package kr.co.mlec.day11;

import java.io.Serializable;

/*
 	기본생성자 단축키		: alt + shift + s 누른후, c
 	매개변수생성자 단축키	: alt + shift + s 누른후, o
 	getter / setter	: alt + shift + s 누른후, r
 	toString()		: alt + shift + s 누른후, s
 	override		: alt + shift + s 누른후, v
 */

public class UserInfo implements Serializable{	// 객체 직렬화 시킴 (object형으로 한번에 뽑으려고)
	
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	private 			String name;
	private transient 	int		age;	// trasient 객체 직렬화 빼기
	private 			String addr;
	
	public UserInfo() {
		
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

	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}}
