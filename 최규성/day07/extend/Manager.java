package day07.extend;
// 관리자도 사람이야 사람
public class Manager {
	
	int no;
	String name;
	int salary;
	String grade;

	Employee[] empList; // 관리사원 목록

	
	Manager(int no, String name, int salary, String grade, Employee[] empList) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}

	void info() {
		System.out.println("번호: " + no);
		System.out.println("이름: " + name);
		System.out.println("연봉: " + salary);
		System.out.println("직급: " + grade);

		System.out.println("=====================");
		System.out.println("======관리 사원 목록======");
		for (int i = 0; i < empList.length; i++) {
			empList[i].info();
		}
		/*
		 * for(Employee e : empList) {
		 * 		e.info(); 
		 * }
		 */
	}

}
