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
	
	default void copyright() {		//인터페이스에선 메소드를 생성할수없지만
		System.out.println("저작권");	//default를 사용하여 가능케한다.
	}								//이미 만들어진 코드에 추가적으로 사용할때만 쓴다.
									//설계부터가 아닌 유지보수를 목적으로함(1.8이후부터 사용가능)
}
