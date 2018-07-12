package kr.co.mlec.day06;

class Member {
	String name;
	int age;
	String bloodType;
	
	Member() {
		this("알수없음");
	}
	
	Member(String name) {
		this(name, -1);
	}
	
	Member(String name, int age) {
		//Member(name, age, "알수없음"); 에러!!!!!!!!!!!
		//이 경우는 에러가 발생하는데 클래스명을 이용하여 생성자를 쓸때는 new와 써야만한다
		//하지만 new Member라고 써버리면 새로운 객체를 생성하게된다 그래서
		//생성자 내에서 생성자를 호출하기위해서는 this를 이용한다
		//생성자 안이 아닌 곳에서는 this를 사용할 수 없다
		this(name, age, "알수없음");
		//생성자가 만들어지고 나서 문장을 수행하거나 출력해야하기때문에
		//생성자 내에서 생성자를 호출하기 위한 this는 첫번째 구문에 위치해야함
		//ex)
		//System.out.println();
		//this(name, age, "알수없음");
		//예시 코드는 에러가 난다
		
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("이름 : " + name 
				+ ", 나이 : " + age + ", 혈액형 : " + bloodType);
	}
	
	//클래스 내에서 멤버변수는 선언을 따로 하지 않고 자유롭게 쓸 수 있지만 헷갈리니깐 this.name으로 쓰는 것이 일반적이다
	//지역 변수 name 멤버변수 name 둘다 있으면 인터프리터가 먼저 지역변수 name이 먼저 있는지 찾아보고 없으면 멤버변수의 값을 이용
		
}

public class ConstructorMain02 {

	public static void main(String[] args) {
		
		Member m = new Member();
		m.info();
		
		Member m2 = new Member("홍길동");
		m2.info();
		
		Member m3 = new Member("강길동", 23);
		m3.info();
		
		Member m4 = new Member("최길동", 31, "AB");
		m4.info();
	}
}










