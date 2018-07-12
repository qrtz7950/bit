package kr.co.mlec.day07.extend;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e = new Employee(1,"홍길동", 3000, "사원");
		Employee e2 = new Employee(2,"강길동", 3200, "사원");
		Employee e3 = new Employee(3,"최길동", 3500, "대리");
		Employee e4 = new Employee(4,"한길동", 3800, "대리");
		Employee e5 = new Employee(5,"박길동", 4300, "과장");
		
		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		Employee [] empList = {e,e2,e4};

//		Manager m = new Manager(100,"나최고", 6000, "부장", empList);
//		m.info();
		
		Manager01 m01 = new Manager01(100,"나최고", 6000, "부장", empList);
		m01.info();

	}
}
