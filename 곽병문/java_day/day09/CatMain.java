package kr.co.mlec.day09;

class Cat{
	
	private String name;
	private int age;
	
	Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@ Override
	public String toString() {
		return "이름 : " + name + ", " + age + "살";
	}
}

public class CatMain {

	public static void main(String[] args) {
		Cat c = new Cat("야옹이", 2);
		
		System.out.println("이름 : " + c.getName() + ", " + c.getAge() + "살");
		
		c.setName("고양");
		c.setAge(3);
		
		System.out.println("이름 : " + c.getName() + ", " + c.getAge() + "살");
		
		System.out.println("c : " + c);
		System.out.println("c : " + c.toString());
		
		String str = "헤헤";
		System.out.println(str);
		System.out.println(str.toString());
		
		while(true) {
			Cat c2 = null;
			try {
				System.out.println("c2 : " + c2.toString());
			}catch(Exception e){
				System.out.println("으앗");
				break;
			}
		}
	}

}
