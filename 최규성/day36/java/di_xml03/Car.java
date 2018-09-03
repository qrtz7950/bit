package di_xml03;

public class Car {
	
	private Tire tire;
	
	public Car(Tire tire) {
		System.out.println("Car(Tire)생성자 호출...");
		this.tire = tire;
	}
	public Car(Tire tire, int num) {
		System.out.println("Car(Tire,int)생성자 호출...");
		this.tire = tire;
	}
	
	public Car(int num, Tire tire, int num2) {
		System.out.println("Car(int, tire, int)생성자 호출");
		this.tire = tire;
	}

	public void setTire(Tire tire) {
		System.out.println("setTire() 메소드 호출...");
		this.tire = tire;
	}

	public String getTireBrand() {
		return "장착된 타이어 :" + tire.getBrand();
	}
}
