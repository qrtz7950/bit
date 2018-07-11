package kr.co.mlec.day07.extend;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] e = new Employee[5];
		
		e[0] = new Employee(1, "홍길동", 280, "사원");
		e[1] = new Employee(2, "강길동", 300, "사원");		
		e[2] = new Employee(3, "최길동", 330, "대리");		
		e[3] = new Employee(4, "한길동", 350, "대리");		
		e[4] = new Employee(5, "박길동", 380, "과장");
		
		e[0].info();
		e[1].info();
		e[2].info();
		e[3].info();
		e[4].info();
		
		Employee[] empList = {e[0], e[2], e[4]};
		
		Manager m = new Manager(100, "나최고", 500, "부장", empList);
		m.info();
		
		m.display();

	}

}
