package day06;

//[this는 생성자안에서만 사용한다.]
//생성자는 객체를 만들고 값을 초기화해야하기 때문에 생성자 가장 첫줄에 써야한다.

class Member {
	String name; // 자신의 변수를 사용하기 위해서는 원래 this.name으로 써야하지만
	int age; // 쓰지않아도 자바가 알아서 변수를 찾아준다.
	String bloodType;

	Member() {
		this("알수없음", -1 ,"알수없음");	//this를 가장 첫줄에 써야한다
		name = "알수없음";
//		age = -1;
//		bloodType = "알수없음";
	}
	Member(String name) {
		this(name, -1);
	}
	Member(String name, int age) {
		this(name, age, "모름"); 
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알수없음";
	}
	Member(String name, int age, String bloodType) { //객체를 초기화하기 떄문에 멤버의 변수랑 이름을 맞추는게 좋다.
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	void info() {
		System.out.println("이름: " + this.name + " 나이: " + age + " 혈액형: " + bloodType);
	}
}

public class ConstructorMain02 {

	public static void main(String[] args) {

		Member m = new Member();
		m.info();

		Member m2 = new Member("홍길동");
		m2.info();
		
		Member m3 = new Member("강길동" ,23);
		m3.info();
		
		Member m4 = new Member("최길동", 31, "AB");
		m4.info();
	}

}
