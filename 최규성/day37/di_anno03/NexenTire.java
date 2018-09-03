package di_anno03;

import org.springframework.stereotype.Component;

@Component
public class NexenTire implements Tire{

	public NexenTire() {
		System.out.println("NexenTire() 기본생성자 호출");
	}
	
	public String getBrand() {
		// TODO Auto-generated method stub
		return "넥센타이어";
	}

	
}
