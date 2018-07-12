package kr.co.mlec.day08.inter.type02;

public interface TV {
	
	int MAX_VOLUME = 40;
//	public static final int MAX_VOLUME = 40; //생략된 부분이 있다
	int MIN_VOLUME = 0;
	
	void powerOn();
//	public abstract void powerOn(); // 생략된 부분이 있다
	void powerOff();
	void channelUp();
	void channelDown();
	void soundUp();
	void soundDown();
	void mute();
}
