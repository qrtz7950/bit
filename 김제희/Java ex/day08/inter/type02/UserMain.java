package kr.co.mlec.day08.inter.type02;

public class UserMain {

	public static void main(String[] args) {
		LGTV tv = new LGTV();
		tv.powerOn();
		tv.channelDown();
		tv.channelUp();
		tv.soundDown();
		tv.soundUp();
		tv.mute();
		tv.powerOff();
	}

}
