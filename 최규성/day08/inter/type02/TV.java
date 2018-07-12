package day08.inter.type02;

public interface TV {
	
	int MAX_VOLUME = 40;	//앞에 public static final이 생략돼있는
	int MIN_VOLUME = 0;		//상수이다.
	
	/*public abstract가 생략*/void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void soundUp();
	void soundDown();
	void mute();
	
}
