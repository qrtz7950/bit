package di_java03;
/*
 * JAVA에서의 DI : setter 주입방식(속성주입방식)
 * 
 * - 운전자가 타이어 따로 주문
 * - 운전자가 자동차 따로 주문
 * - 운전자가 직접 자동차에 타이어를 장착
 */
public class DriverMain {

	public static void main(String[] args) {

		Tire tire = new KoreaTire();	//타이어 따로
		
		Car car = new Car();			//자동차 따로 주문
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
	}

}
