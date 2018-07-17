package kr.co.mlec.day11;

import java.io.Serializable;

/*
 *	기본생성자 		: alt + shift + s 누른 후, c선택
 *  매개변수생성자          : alt + shift + s 누른 후, o선택
 *  getter/setter   : alt + shift + s 누른 후, r선택
 *  toString()      : alt + shift + s 누른 후, s선택
 *  override        : alt + shift + s 누른 후, v선택
 */
public class UserInfo implements Serializable {

	private 		  	String	name;
	private transient 	int 	age;
	private 			String 	addr;
	
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

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
}
