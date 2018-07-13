package day09;

public class ExceptionMain03 {

	public static void main(String[] args) {

		System.out.println("main start...");

		for (int i = -2; i < 4; i++) {
			try {
				System.out.println(10 / i);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("예외 발생");
			} finally {	//예외가 나더라도 꼭 수행함
				System.out.println("반복문 수행중"); //예외가 생겨도 바로 캐치로 안가고 헬로우를 출력하고 예외처리실행
			}
		}
		System.out.println("main end...");
	}
}
