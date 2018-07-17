package day10;

import java.util.HashMap;
import java.util.Map;

class Member{
	private String name;
	private String phone;
	
	Member(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
//[매우 중요함]이클립스 상단의 소스창 -> Generate hashcode()...을 눌러서 지정해주면 밑 처럼 자동으로 오버라이딩해줌
//name과 phone이 둘다 같아야하기 떄문에 두개 체크하면 바로 밑처럼 자동으로 오버라이드해준다
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	
	
	/*@Override
	public boolean equals(Object obj) {	//이퀄이 오브젝트 클래스에서 두 주소값을 비교하는 메소드이기 때문에 두개의 데이터를 비교할수있게 오버라이딩해줘야한다.
		
		Member m = (Member)obj;
		
		if(this.name.equals(m.name) && this.phone.equals(m.phone)) {
			return true;
		} else {
			
		}
	
	
	
		return false;
	}*/
	
	
}

class Car{
	private String modelName;
	private int price;
	
	Car(String modelName, int price){
		this.modelName = modelName;
		this.price = price;
	}
}

public class MapMain02 {

	public static void main(String[] args) {

		Map<Member, Car> memberList = new HashMap<Member, Car>();
		
		memberList.put(new Member("홍길동", "010-1111-2222"),new Car("아반떼", 2400));
		memberList.put(new Member("최길동", "010-3333-4444"),new Car("소나타", 2700));
		memberList.put(new Member("박길동", "010-5555-6666"),new Car("모닝", 1800));
		//홍길동이 k5로 차를 바꿈
		memberList.put(new Member("홍길동", "010-1111-2222"),new Car("K5",2800)); 
		System.out.println("등록대수: " + memberList.size());
		//같은 객체란 해쉬코드도 같고 이퀄도 트루여야한다.
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		System.out.println("m hashCode: " + m.hashCode());
		System.out.println("m2 hashCode: " + m2.hashCode());
		
		if(m.equals(m2)) {
			System.out.println("m == m2");
		} else {
			System.out.println("m != m2");
		}
		
	}

}
