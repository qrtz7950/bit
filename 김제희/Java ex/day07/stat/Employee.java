package kr.co.mlec.day07.stat;

public class Employee {
		
	static int totalCnt;
	String name;

	Employee() {
		totalCnt++;
	}
	
	Employee(String str) {
		this.name = str;
		System.out.println(name + " 사원이 입사했습니다");
		totalCnt++;
	}
	
	static void employeeInfo() {
		System.out.println("입사한 총 사원수: " + Employee.totalCnt + "명");
	}
	
	void info() {
		System.out.println("사원명: " + name);
	}
	
	
}
