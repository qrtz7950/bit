package di_anno04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KiaMaker implements CarMaker {
	
	@Autowired
	private Car car;
	
	@Override
	public Car sell(Money money) {
		
		car.setName("K9");
		System.out.println(car.getName() + "을" + money.getAmount() + "원에 차량을 팔았습니다");

		return car;
	}
}
