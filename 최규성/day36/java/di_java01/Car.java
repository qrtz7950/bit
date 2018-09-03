package di_java01;

public class Car {

	private Tire tire;

	public Car() {
		//의존 관계 발생 -> Car는 Tire없이는 아무 소용이 없기때문
	//	tire = new KoreaTire();		//타이어를 교체할때마다 Car()를 고치는게 좋지않음
		tire = new NexenTire();
	}
	
	
	public String getTireBrand() {
		return "장착된 타이어: " + tire.getBrand();
	}
	
}
