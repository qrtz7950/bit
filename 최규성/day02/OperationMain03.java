package day02;
import java.util.Random;
public class OperationMain03 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int num = r.nextInt(11); // 0 ~ 11
//		int num = r.nextInt(10) + 1; //1~10
		System.out.println(num);
		
		System.out.println(num==0? "ÇØ´ç»çÇ× ¾øÀ½" :(num % 2 == 0? "Â¦¼ö" : "È¦¼ö")); // Â¦ or È¦ or ÇØ´ç»çÇ×¾øÀ½
	/*	
		String msg = num % 2 == 0 ? "Â¦¼ö" : "È¦¼ö";
		
		System.out.println(num + " = " + msg);
		System.out.println(num + " = " + (num % 2 == 0? "Â¦¼ö": "È¦¼ö")); // Â¦ or È¦
	*/	
		

	}

}
