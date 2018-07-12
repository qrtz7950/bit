package kr.co.mlec.day05;

public class HandphoneMain {

	public static void main(String[] args) {
		Handphone hp = new Handphone();
		//핸드폰 인스턴트 객체 생성
		System.out.println("name: " + hp.name); 
		System.out.println("phone: " + hp.phone); 
		System.out.println("company: " + hp.company); 
		
		System.out.println(); 
		//자동초기화 초기값 null값이 들어잇다
		
		hp.name = "곽곽곽";
		hp.phone = "010-1234-5678";
		hp.company = "돼지같잖아";
		
		System.out.println("name: " + hp.name); 
		System.out.println("phone: " + hp.phone); 
		System.out.println("company: " + hp.company); 
		
		//핸드폰을 한개 더 만들어보자
		
		Handphone hp2 = new Handphone();
		
		hp2.name = "최최최";
		hp2.phone = "010-9012-3456";
		hp2.company = "통학충";
		
		Handphone hp3 = new Handphone();
		
		hp3.name = "김김김";
		hp3.phone = "010-7890-1234";
		hp3.company = "붕어빵!";
		
		System.out.println("name: " + hp.name + "전화번호: " + hp.phone + "소속: " + hp.company);
		System.out.println("name: " + hp2.name + "전화번호: " + hp2.phone + "소속: " + hp2.company);
		System.out.println("name: " + hp3.name + "전화번호: " + hp3.phone + "소속: " + hp3.company);
		System.out.println();
		
		//이제 이것을 배열을 이용하여 변수 선언을 할  수 있다
		Handphone [] hpArr = {hp, hp2, hp3};
		
		for(int i=0; i<hpArr.length; i++) {
			System.out.println("소유주: " + hpArr[i].name + "전화번호: " + hpArr[i].phone + "소속:" + hpArr[i].company);
		}
		
		System.out.println();
		
		for(Handphone phone : hpArr) {
			System.out.println("소유주 : " + phone.name + ", 전화번호 : " + phone.phone + ", 제조사 : " + phone.company);
		}
		
		System.out.println("=========================================================");
		
		Handphone [] hArr = new Handphone[3];
		
		//여기까지는 단지 핸드폰형의 배열을 만든것 뿐이고 그 주소값이 객체를 가리키는 것이 아니기때문에
		//아래와 같이 각각의 배열의 주소값이 객체를 가리키도록 해야한다
		
		for(int i=0; i<hArr.length; i++) {
			hArr[i] = new Handphone();
		}
		
		hArr[0].name = "홍길동";
		hArr[0].phone = "010-1111-2222";
		hArr[0].company = "삼성";
		
		hArr[1].name = "강길동";
		hArr[1].phone = "010-3333-4444";
		hArr[1].company = "엘지";
		
		hArr[2].name = "최길동";
		hArr[2].phone = "010-5555-666";
		hArr[2].company = "애플";
		
		for(Handphone phone : hArr) {
			System.out.println("소유주 : " + phone.name
							+ ", 전화번호 : " + phone.phone
							+ ", 제조사 : " + phone.company);
		}
		
		
	}

}
