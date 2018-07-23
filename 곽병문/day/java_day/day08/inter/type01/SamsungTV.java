package kr.co.mlec.day08.inter.type01;

public class SamsungTV {
	
	boolean power;
	
	public void turnOn() {
		System.out.println("전원 ON()");
	}
	
	public void turnOff() {
		System.out.println("전원 Off()");
	}
	
	public void channelUp() {
		System.out.println("채널 UP()");
	}
	
	public void channelDown() {
		System.out.println("채널 DOWN()");
	}
	
	public void soundUp() {
		System.out.println("음량 UP()");
	}
	
	public void soundDown() {
		System.out.println("음량 DOWN()");
	}
	
}
