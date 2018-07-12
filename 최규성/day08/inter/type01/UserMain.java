package day08.inter.type01;

public class UserMain {

	public static void main(String[] args) {

		LGTV lg = new LGTV();
		lg.powerOn();
		lg.channelDown();
		lg.volumeDown();
		lg.volumeUp();
		lg.channelUp();
		lg.powerOff();

		System.out.println("--------------------");
		
		SSTV ss = new SSTV();
		ss.turnOn();
		ss.channelDown();
		ss.volumeDown();
		ss.volumeUp();
		ss.channelUp();
		ss.turnOff();
	}

}
