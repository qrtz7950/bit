package kr.co.mlec.day07.extend;

public class Employee {
		
	int no;			//사원번호
	String name;	//사원명
	int salary;		//월급
	String grade;	//직급
	
	Employee(){
	}
	
	Employee(int no, String name, int salary, String grade) {
		this.no=no;
		this.name=name;
		this.salary=salary;
		this.grade=grade;
		
	}
	
	void info() {
		System.out.print("번호: " + no);
		System.out.print(" 이름: " + name);
		System.out.print(" 연봉: " + salary);
		System.out.print(" 직급: " + grade + " \n");
	}
	
}
