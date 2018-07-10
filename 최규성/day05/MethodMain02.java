package day05;

/*
 *  메소드 오버로딩
 *  	: 자신의 클래스의 메소드 명은 동일하면서 매개변수의 개수 또는 자료형이 다른 것
 */
public class MethodMain02 {

	public static void main(String[] args) {

		Method m = new Method();
		m.info();
		m.call();
		m.call(10);
		m.call(1.1);
		m.call("HI",12);
		m.call('A');   	//A는 위의 int, double 로도 받을수있기 때문에 char메소드를 만들어주지않으면 위에서 가장 가까운 메소드인 int메소드로 받게된다.
	}

}
