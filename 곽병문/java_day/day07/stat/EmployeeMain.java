package kr.co.mlec.day07.stat;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e = new Employee("±Ë»Ò¡¶");
		
		Employee e2 = new Employee("√÷º∫±‘");
		
		Employee.howMany();
		
		e.info();
		e2.info();
		
		e.setName("≈¥»Ò¡¶");
		e.info();
	}

}
