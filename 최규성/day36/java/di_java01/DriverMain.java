package di_java01;
/*
 * 주입방식 없는 경우
 */
public class DriverMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car.getTireBrand());
	}
}
