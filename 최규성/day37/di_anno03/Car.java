package di_anno03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	//@Autowired	//(KoreaTire.java line:5)
	//@Resource(name="nexenTire")	//여러개의 타이어 클래스들에서 정해주는게 비효율적이기 때문에 이렇게 지정해줄수있다.
	
//	@Autowired
//	@Qualifier("koreaTire")
	private Tire tire;
	
	public Car() {
		System.out.println("Car() 기본생성자 호출");
	}
	
	//@Autowired
	//@Qualifier() 생성자는 매개변수가 여러개 올수있기 때문에 뭐가 의존성을 가진 변수인지 모르기 때문에 생성자에 적용시에는 
	//					public Car(@Qulifier("nexenTire")Tire tire, ?, ?, ...) {
	//					} 의 형식으로 매개변수 앞에서 어노테이션을 붙여야 한다.
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire) 생성자 호출");	//context:annotation-config태그를 xml에 추가하면 출력됨
	}
	
	@Autowired
	@Qualifier("nexenTire")
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("SetTire() 메소드 호출");
	}
	
	public String getTireBrand() {
		return "장착된 타이어 : "+ tire.getBrand();
	}
}
