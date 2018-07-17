package kr.co.mlec.day10;

import java.util.HashMap;
import java.util.Map;

class Member {
	private String name;
	private String phone;
	
	Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

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

/*
	@Override
	public boolean equals(Object obj) {
		
		Member m = (Member)obj;
		
		if(this.name.equals(m.name) && this.phone.equals(m.phone)) {
			return true;
		}
	}
	
	@Override
	public int hashCode() {
		return 100000;
	}
*/
	
}

class Car {
	private String modelName;
	private int price;
	
	Car(String modelName, int price) {
		this.modelName = modelName;
		this.price = price;
	}

}

public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> memberList = new HashMap<Member, Car>();
		
		memberList.put(new Member("홍길동", "010-1111-2222"), new Car("아반떼",2400));
		memberList.put(new Member("최길동", "010-3333-4444"), new Car("소나타", 2700));
		memberList.put(new Member("박길동", "010-5555-6666"), new Car("모닝", 1800));
		memberList.put(new Member("홍길동", "010-1111-2222"), new Car("K5",2800));
		
		System.out.println("등록대수 : " + memberList.size() );
		
		
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		if(m.equals(m2)) {
			System.out.println("m == m2");
		} else {
			System.out.println("m != m2");
		}
		//이러면 주소값 비교해버림
		//의미없죠?
		//
		
		
		/*
		String str = new String("Hello");
		String str2 = new String("Hello");
		
		if(str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		if(str.equals(str2)) {
			System.out.println("equals() => str == str2");
		} else {
			System.out.println("equals() => str != str2");
		}
		*/
	}
}














