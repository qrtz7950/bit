package di_java02;

public class Car {

	private Tire tire;	//외부에서 만들어진 의존하려는 객체를 의존받는 객체에 적용한다.
						//Car클래스에 타이어를 바꾸지않아도 된다.
	
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public String getTireBrand() {
		return "장착된 타이어: " + tire.getBrand();
	}
}
