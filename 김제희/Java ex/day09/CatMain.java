package kr.co.mlec.day09;

class Cat { 
	
	private String name;
	private int age;
	
	Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void info() {
		System.out.println("name: " + name + " age: " + age);
	}
	
	//일반적으로 멤버변수의 값을 보여주기위해 get을 붙인 메소드를 이용한다
	//ex) getName() getAge()
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	//일반적으로 외부에서 넘겨주는 값으로 멤버변수 값으로 바꾸고 싶을 때 set을 사용
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//이런 기본적으로 getter setter 메소드는 이클립스 편집기의 
	//Source - Generate getters and setters 를 눌러서 위의 메소드를 자동으로 만들수 있다
	
//	@Override //어노테이션으로 오버라이드가 됫는지 확인가능
//	//객체가 가진 멤버변수값을 찍을 수 있도록  toString을 많이 오버라이드한다
//	public String toString() {
//		return "name: " + name + " age: " + age;
//	}
	
	//Source -  Generate toString 을 이용하여 객체변수를 출력할 때 주소값이 아닌 클래스의 멤버변수를
	//출력하는 toString을 오버라이드한 메소드를 자동으로 생성할 수 있다.
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	} 
	//자동생성
	//Cat c = new Cat();
	//이제 c를 출력하면 주소값이 아닌 멤버변수값을 출력한다
	
	
}

public class CatMain {
	
	public static void main(String[] args) {
		
		Cat c = new Cat("모찌", 3);
		
		c.info();
		System.out.println("고양이: " + c.getName());
		
		System.out.println("고양이이름이랑 나이를 바꿔버리겠다");
		c.setName("멍청이");
		c.setAge(4);
		c.info();
		
		System.out.println("c: " + c);
		System.out.println("c: " + c.toString());
		//객체와 객체 사이의 의사소통의 기본은 메소드이다
		//때문에 위의 c를 그냥 출력하는 것은 아래 줄과 같이 메소드가 생략되어있는것이다
		//모든 클래스는 기본적으로 Object클래스를 상속받기 때문에 가능
		//해당 클래스에는 toString hashcode 등의 메소드가 들어있다
		//위에서 toString을 오버라이드하여 멤버변수값을 보여주는 메소드가 되었다
		
		String str = new String("Hello");
		System.out.println("str: " + str);
		System.out.println("str: " + str.toString());
		
		//이 코드도 원래는 str참조 변수의 주소값을 찍어야하나 
		//value를 리턴하도록 오버라이드되어있기때문에 Hello를 출력
		
		while(true) {
			Cat c2 = null; /*new Cat("멍멍이", 6);*/
			System.out.println("c2: " + c2.toString());
			//중간에 문제가 생기면 종료되어야하나 종료되지 않고 계속 소프트웨어가 실행되도록하고싶다
			//이럴 때 예외처리를 사용한다
			//if와 else if를 이용하여 대부분의 오류들은 제어가 가능하나
			//개발자가 인지하지 못한 부분도 소프트 웨어가 자동으로 이것을 제어할수 있게하는것
		}
		
		
		
	}

}
