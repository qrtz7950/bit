package kr.co.mlec.day06;

class Member{
	String name;
	int age;
	String bloodType;
	
	void info() {
		System.out.printf("내이름은 %s, 내 나이는 %d, 내 혈액형은 %s, 탐정이죠\n", this.name, this.age, this.bloodType);
	}
	
	Member(){
		this("알수없음");
	}
	
	Member(String name){
		this(name, -1);
	}
	
	Member(String name, int age){
		this(name, age, "알수없음");
	}
	
	Member(String name, int age, String blood){
		this.name = name;
		this.age = age;
		this.bloodType = blood;
	}
	
}

public class ConstructorMain02 {

	public static void main(String[] args) {
		
		Member kjh = new Member("김제희", 24, "A");
		
		kjh.info();
		
		Member cgs = new Member("최규성", 25, "AB");
		
		cgs.info();
	}

}
