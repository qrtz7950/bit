package kr.co.mlec.day10;

import java.util.HashMap;
import java.util.Map;

class Member {
	private String name;
	private String phone;
	
	Member(String name, String phone){
		this.name = name;
		this.phone = phone;		
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}
	
	
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
		
		memberList.put(new Member("È«±æµ¿", "010-1111-2222"), new Car("¾Æ¹Ý¶¼", 2400));
		memberList.put(new Member("ÃÖ±æµ¿", "010-3333-4444"), new Car("¼Ò³ªÅ¸", 2700));
		memberList.put(new Member("¹Ú±æµ¿", "010-5555-6666"), new Car("¸ð´×", 1800));
		memberList.put(new Member("È«±æµ¿", "010-1111-2222"), new Car("K5", 2800));
		
		Member m = new Member("È«±æµ¿", "010-1111-2222");
		Member m2 = new Member("È«±æµ¿", "010-1111-2222");
		
		if(m.equals(m2)) {
			System.out.println("m1 == m2");
		}else {
			System.out.println("m1 != m2");
		}
		
		System.out.println("µî·Ï´ë¼ö : " + memberList.size());
	}

}
