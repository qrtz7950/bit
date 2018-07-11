package kr.co.mlec.day07.extend;

public class Manager extends Employee {
	
	Employee[] empList;
	
	Manager(){
		
	}
	
	Manager(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}
	
	void info() {
		super.info();
		System.out.println("===========================");
		System.out.println("\t관리사원 목록");
		System.out.println("===========================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("===========================");
	}
	
	void print() {
		System.out.println("sub");
	}
	
	void display() {
		super.print();
		this.print();
	}
}
