package day08.inter.type02;

public class UserMain {

	public static void main(String[] args) {

		//LGTV tv = new LGTV();	//LGTV, SSTV 둘중 하나를 써도 에러가 나지않는다
		SSTV tv = new SSTV();
		//TV tv = new SSTV();
		
		tv.powerOn();
		tv.soundDown();
		tv.channelUp();
		tv.powerOff();
	}

}
