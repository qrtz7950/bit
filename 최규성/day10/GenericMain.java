package day10;

import java.util.ArrayList;


/*class MyArrayList <T> {
	private T[] values;				<-이런식으로도 만들수있음
	MyArrayList (){
		values = new T[10];
	}
}*/

public class GenericMain {

	public static void main(String[] args) {

		ArrayList<String> list2 = new ArrayList<String>();	//<>을 써서 밑줄의 add의 타입이 String으로 변함
		list2.add(new String("Hello"));
		// list2.add(new Integer(123));	제너릭을 스트링으로 썼기때문에 인티저에서 에러남
		
		
		
		ArrayList list = new ArrayList();	//
	
		list.add(new String("hello"));	//add로 배열내용을 저장할수있다.
		list.add(new Integer(123));		//0번지부터 순차적으로 저장됨
		list.add(new Object());
	
		
		System.out.println((String)list.get(0));
		System.out.println((Integer)list.get(1));
		
		//ex) String val = list.get(0)	=> 0번지의 스트링객체를 호출
		//ex) int size = list.size();     => 배열에 저장된 값의 개수
		//ex) list.remove(0);			=> 0번지의 데이터가 삭제, 삭제 후 1번지가 0번지가 됨
		//ex) list.remove("123"); 		=>123이 저장된 모든 번지를 삭제
		//ex) boolean b = list.contains("AA")  => AA라는 값이 배열에 있는지 물어봄
		//ex) boolean b = list.Empty() => 배열에 아무것도 없으면 true
		//ex) list.addAll(sub);			=>sub배열을 list배열 뒤에 추가한 값으로 변함(sub배열은 변하지않음)
		//ex) list.clear(); 			=>list배열을 삭제
	
	
	}

}
