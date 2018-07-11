package day07.extend;

public class Employee {

	int no;			//사원번호
	String name;	//사원명
	int salary;		//연봉
	String grade;	//직급

	Employee(){	
		//매개변수가 없는 디폴트 생성자를 생성해야 Manager01생성자에서 에러가 안난다.
	}
	
	Employee(int no, String name, int salary, String grade){
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	void info() {
		System.out.println("번호: " + no);
		System.out.println("이름: " + name);
		System.out.println("연봉: " + salary);
		System.out.println("직급: " + grade);
	}

}
