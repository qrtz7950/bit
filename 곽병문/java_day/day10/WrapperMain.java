package kr.co.mlec.day10;

/*
 	boolean		Boolean
	char		Character
	byte		Byte
	short		Short
	int			Integer
	long		Long
	float		Float
	double		Double
 */
public class WrapperMain {

	public static void main(String[] args) {
		
		int num = 10;
		Integer i = new Integer(10);
		num = new Integer(100);		// auto boxing
		i = 120;					// auto unboxing
		
		System.out.println(num);
		System.out.println("i : " + i.toString());
		
		String str = "12345";
		System.out.println(Integer.parseInt(str));
		System.out.println(Integer.valueOf(str));
		
	}

}
