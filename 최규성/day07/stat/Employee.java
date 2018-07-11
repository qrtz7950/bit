package day07.stat;

public class Employee {

	String name;
	static int totalCnt; 	//static을 쓰지않으면 객체를 따로 만들기 때문에
							//입사 인원을 카운트 할 수 없다.
	
	Employee(){
		totalCnt++;
	}
	
	Employee(String name){
		this.name = name;
		System.out.println(name + "사원이 입사했습니다.");
		totalCnt++;
	}
	
	void info() {
		System.out.println("사원명: " + name);
	}
	
	static void empCountInfo() {	 //static이 가리키는 공간은 파일을 실행시키는 동시에 생성된다.
		System.out.println("입사한 총 사원수: " +  Employee.totalCnt + "명");
	}
}
