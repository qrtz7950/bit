package di_xml01;

public class Car {
	
	private Tire tire;
	

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public String getTireBrand() {
		return "장착된 타이어 :" + tire.getBrand();
	}
}
