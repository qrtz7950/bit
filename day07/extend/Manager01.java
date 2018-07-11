package kr.co.mlec.day07.extend;

public class Manager01 extends Employee {
		
	Employee [] empList; //관리 사원목록
	
	Manager01(){
		
	}
	
	Manager01(int no, String name, int salary, String grade, Employee[] empList) {
		super(no,name,salary,grade);
		//상위 클래스의 생성자를 호출함 
		//상위 클래스에 매개변수가 없는 생성자가 없으면 super(); 호출시 에러
		//임플로이를 상속한 매니저의 객체를 생성하면 실질적으로는 임플로이와 매니저 두개의 인스턴트 객체를 생성하기때문에
		//상위 클래스의 생성자를 호출해 임플로이의 공간도 만들어줘야한다
		//this.를 사용해도 되나 직접 상위클래스의 멤버변수에 접근하기위해서는 super.로 명명해야함
		//this.no = no;
		//this.name = name; 	// super.name = name;
		//this.salary = salary;
		//this.grade = grade;
		this.empList=empList;
	}
	
	void info() {
		super.info();
		System.out.println("====================================");
		System.out.println("            관리사원 리스트                                ");
		System.out.println("====================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("====================================");
	}
}
