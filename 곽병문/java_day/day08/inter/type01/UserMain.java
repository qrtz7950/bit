package kr.co.mlec.day08.inter.type01;

public class UserMain {

	public static void main(String[] args) {
		
		LGTV lg = new LGTV();
		lg.powerOn();
		lg.channelDown();
		lg.volumeDown();
		lg.volumeUp();
		lg.channelUp();
		lg.powerOff();
		
		SamsungTV sam = new SamsungTV();
		sam.turnOn();
		sam.soundUp();
		sam.channelDown();
		sam.soundDown();
		sam.channelUp();
		sam.turnOff();
	}

}
