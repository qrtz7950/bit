package day10;

/*
 * 기본자료	->	참조자료형
 * boolean		Boolean
 * char			Character
 * byte			Byte
 * short		Short
 * int 			Integer
 * long			Long
 * float		Float
 * double		Double
 * 
 * 정적 자료구조: 고정된 크기의 자료구조로 배열을 대표적인 예로 들수있다.
 * 동적 자료구조: 배열을 제외한 다른 자료구조로 가변적으로 변수를 저장할수있다.
 */
public class WrapperMain {

	public static void main(String[] args) {
		
		int num = 10;
		Integer i = new Integer(10);
		
		System.out.println(num);
		System.out.println(i);
		
		num = new Integer(100);	//오토 박싱
		i = 120;				//오토 언박싱
		
		System.out.println(num);
		System.out.println(i);

		String str = "12345";
		
		//둘 다 다른타입을 정수형으로 바꿔준다.
		System.out.println(Integer.parseInt(str));	//기본자료형으로 리턴
		System.out.println(Integer.valueOf(str));	//참조자료형으로 리턴
	}

}
