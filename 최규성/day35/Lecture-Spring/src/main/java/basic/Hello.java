package basic;

public class Hello {

	private String msg;
	private static Hello instance;
	
	public Hello() {
		System.out.println("Hello 객체 생성 완료...");
		this.msg = "Hello";
		
	}
	
	public void prnMsg() {
		System.out.println("Hello's msg : " + msg);
	}
	
	public static Hello getInstance() {
		if(instance == null) {
			instance = new Hello();
		}
		
		return instance;
	}
	
}
