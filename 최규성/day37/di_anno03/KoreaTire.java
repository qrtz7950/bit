package di_anno03;

import org.springframework.stereotype.Component;

//@Component("tire")	//nexenTire라는 id가 tire로 겹치기 때문에 따로 정해줄수있다

@Component	//@auto, qulifier 적용시
public class KoreaTire implements Tire{

	public KoreaTire() {
		System.out.println("KoreaTire() 기본생성자 호출");
	}
	
	public String getBrand() {
		
		return "한국타이어";
	}
}
