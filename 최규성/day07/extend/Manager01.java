package day07.extend;

public class Manager01 extends Employee {

	Employee[] empList;

	Manager01() {
		// 디폴트 생성자를 먼저 만들어 준다.
	}

	Manager01(int no, String name, int salary, String grade, Employee[] empList) {
		super(); // 안써져 있어도 이게 디폴트임, 숨어있음
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}

	void info() {
		super.info();
		System.out.println("번호: " + no);
		System.out.println("이름: " + name);
		System.out.println("연봉: " + salary);
		System.out.println("직급: " + grade);

		System.out.println("=====================");
		System.out.println("======관리 사원 목록======");
		for (int i = 0; i < empList.length; i++) {
			empList[i].info();
		}
	}
}
