package di_anno04;

import org.springframework.stereotype.Component;

@Component
public class Money {

	private int amount;

	public Money(int amount) {
		super();
		this.amount = amount;
	}

	public Money() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
