package di_anno04;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car(String name) {
		super();
		this.name = name;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
