package day07;

public class StringMain06 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		String str = "";
		for(int i = 1 ; i <100000; i++){
			str = str + i;	//str = str.concat(i)
		}
		
		long end =System.currentTimeMillis();
		System.out.println("소요시간: "+ (end -start)/ 1000.+"초");
		//11~13초
		
		//웹에서는 스트링버퍼 클래스만을 사용한다.
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for( int i =1 ; i <100000; i++) {
			sb.append(i);	//sb가 가르키는 공간의 크기가 유동적으로 늘어남
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간: "+ (end -start)/ 1000.+"초");
		//0.00초대
	}

}
