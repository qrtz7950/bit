package day05;

public class HandphoneMain {

	public static void main(String[] args) {

		// 이름: 홍길동, 전화번호: 010-1111-2222, 제조사 : 삼성을 가지는 핸드폰객체 hp생성

		Handphone hp = new Handphone();
		hp.name = "홍길동"; // 참조변수 hp생성
		hp.phone = "010-1111-2222";
		hp.company = "SAMSUNG";
		System.out.println(hp.name + "," + hp.phone + "," + hp.company);

		Handphone hp2 = new Handphone();
		hp2.name = "강길동";
		hp2.phone = "010-3333-4444";
		hp2.company = "APPLE";
		System.out.println(hp2.name + "," + hp2.phone + "," + hp2.company);

		Handphone hp3 = new Handphone();
		hp3.name = "최길동";
		hp3.phone = "010-5555-6666";
		hp3.company = "LG";
		System.out.println(hp3.name + "," + hp3.phone + "," + hp3.company);
		System.out.println();
////////////////////////////////////////////////////////////////////////////
		Handphone[] hpArr = { hp, hp2, hp3 };

		for (int i = 0; i < hpArr.length; i++) {
			System.out.println("소유주: " + hpArr[i].name + "전화번호: " + hpArr[i].phone + "제조사: " + hpArr[i].company);
		}
		System.out.println();
///////////////////////////////////////////////////////////////////////////
		for (Handphone phone : hpArr) {
			System.out.println(phone.name + " " + phone.phone + " " + phone.company);
		}
		System.out.println();
/////////////////////////////////////////////////////////////////////////////
		Handphone[] hArr = new Handphone[3];
		
		//작성해야하는 이유 파악할 것
		for(int i =0 ; i <hArr.length; i++) {
			hArr[i] = new Handphone();
		}
		hArr[0].name = "홍길동";
		hArr[0].phone = "010-1111-2222";
		hArr[0].company = "SAMSUNG";

		for(Handphone phone : hArr) {
			System.out.println(phone.name+" "+phone.phone+" "+ phone.company);
		}
	}

}
