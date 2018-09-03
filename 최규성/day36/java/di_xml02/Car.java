package di_xml02;

public class Car {
	
	private Tire tire;
	

	public void setTire(Tire tire) {
		System.out.println("setTire() 메소드 호출...");
		this.tire = tire;
	}

	public String getTireBrand() {
		return "장착된 타이어 :" + tire.getBrand();
	}
}
