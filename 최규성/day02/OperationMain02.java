package day02;

public class OperationMain02 {

	public static void main(String[] args) {
		int a =1, b = -1, c = 0;
	
		System.out.println(++a >= 0 && ++b < 0 && c++ >0); // b에 관한 조건이 false이기 때문에 뒤의 c에 관련된 조건을 보지않아
		System.out.printf("a = %d, b= %d, c =%d,\n", a, b ,c); // 여기서 c를 출력하면 1이 아닌 0이 출력된다.
		System.out.println(c);
		
		}

}
