package kr.co.mlec.day07.extend;

import java.util.Arrays;

public class Manager {
		
	int no;			//사원번호
	String name;	//사원명
	int salary;		//월급
	String grade;	//직급
	
	Employee [] empList; //관리 사원목록
	
	Manager(int no, String name, int salary, String grade, Employee[] empList) {
		this.no=no;
		this.name=name;
		this.salary=salary;
		this.grade=grade;
		this.empList=empList;
	}
	
	void info() {
		System.out.print("번호: " + no);
		System.out.print(" 이름: " + name);
		System.out.print(" 연봉: " + salary);
		System.out.print(" 직급: " + grade + " \n");
		System.out.println("====================================");
		System.out.println("            관리사원 리스트                                ");
		System.out.println("====================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("====================================");
	}
}
