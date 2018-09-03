package di_anno02;

import javax.annotation.Resource;

public class Car {

	@Resource
	private Tire tire;
	
//	public Car(Tire tire) {
//		this.tire = tire;
//		System.out.println("Car(Tire) 생성자 호출...");
//	}
	
//	@Resource
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire() 호출...");
	}
	
	public String getTireBrand() {
		return "장착된 타이어 : " + tire.getBrand();
	}
}






