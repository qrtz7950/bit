package day04Hw;

public class Hw07 {

	public static void main(String[] args) {

		int m = 0; // 높이
		int h = 0; // 시간

		/*for (int i = 0; i < 35; i++) {
			h++;
			m = m + 5;
			if (m < 50) {
				m = m - 1;
				System.out.println("[" + h + "시간후] 달팽이가 올라간 총 높이: " + m + "M");
			} else if (m >= 50) {
				m = m - 2;
				System.out.println("[" + h + "시간후] 달팽이가 올라간 총 높이: " + m + "M");
			} else if (m > 100) {
				
				System.out.println("[" + h + "시간후] 달팽이가 올라간 총 높이: " + m + "M");
				break;
			}

		}*/
		
		while(m<100) {
			m += 5;
			m = m < 50 ? m-1 : m-2;
			System.out.println("["+ ++h + "시간후] 달팽이 높이: "+ m + "M");
		}

		
	}
}
