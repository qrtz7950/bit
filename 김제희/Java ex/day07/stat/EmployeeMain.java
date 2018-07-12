package kr.co.mlec.day07.stat;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee.employeeInfo();
		System.out.println("총 입사 인원: " + Employee.totalCnt + "명");
		
//		Employee e = new Employee();
//		e.name = "홍길동";
//
//		Employee e2 = new Employee();
//		e.name = "강길동";
//		멤버변수명이 노출되는 것은 좋은 방법이 아니기 때문에 아래의 방법을 쓰도록하자
		
		Employee e = new Employee("홍길동");
		Employee e2 = new Employee("강길동");
		
		System.out.println("총 입사 인원: " + Employee.totalCnt + "명");
		
		e.info();
		e2.info();
		
		
	}
}
