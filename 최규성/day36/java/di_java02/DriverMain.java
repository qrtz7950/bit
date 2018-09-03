package di_java02;
/*
 * JAVA에서의 DI : 생성자 주입방식
 * 
 * - 운전자가 타이어 브랜드 선택
 * - 차를 주문하면 선택된 브랜드로 타이어 장착
 * 
 * 
 */
public class DriverMain {

	public static void main(String[] args) {

	//	Tire tire = new KoreaTire();
		Tire tire = new NexenTire();
		
		Car car = new Car(tire);
		
		System.out.println(car.getTireBrand());
	}

}
