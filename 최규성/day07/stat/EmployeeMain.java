package day07.stat;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee.empCountInfo();
		
		/*Employee e = new Employee();
		e.name = "홍길동";
		
		Employee e2 = new Employee();
		e2.name = "강길동"; */ //외부에서 .name으로 접근하는건 좋지않다
							//변수는 같은 클래스파일에서 수정하는 것이 좋다.
		Employee e = new Employee("홍길동");
		Employee e2 = new Employee("강길동");
		
		System.out.println("입사한 총 인원수: " + e.totalCnt + "명");
	
		
		e.info();
		e2.info();
	
		Employee.empCountInfo();
	}

}
