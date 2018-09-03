package di_anno04;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class HyundaiMaker implements CarMaker {

	@Resource
	private Car car;
	
	@Override
	public Car sell(Money money) {
		
		car.setName("sonata");
		System.out.println(car.getName() + "을" + money.getAmount() + "원에 차량을 팔았습니다");
		
		return car;
	}
}
