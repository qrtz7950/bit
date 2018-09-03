package di_anno04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderManager {
	
	@Autowired
	@Qualifier("hyundaiMaker")
	private CarMaker carMaker;
	
	@Autowired
	private Money money;
	
	@Autowired
	public void Order() {
		
		money.setAmount(3000);
		Car car = carMaker.sell(money);
		System.out.println("ORDER : 차량: [ " + car.getName() + " ] 판매가격: [" + money.getAmount() + "원]");
	}
}
