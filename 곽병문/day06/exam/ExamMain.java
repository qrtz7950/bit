package kr.co.mlec.day06.exam;

public class ExamMain {

	public static void main(String[] args) {
		
		MethodExam exam = new MethodExam();
		
		int sum = exam.sum(1, 10);
		
		System.out.println("1 + 10 = " + sum);
		System.out.println("1 ~ 10 ªÁ¿Ã¿« √—«’ : " + exam.tsum(1,10));
		
		int n1=exam.getInt();
		int n2=exam.getInt();
		exam.displaySum(n1, n2, exam.sum(n1, n2));
		
		int[]a = new int[10];
		a = exam.getNums(a.length);
		System.out.println();
		exam.displayArray(a, a.length);
	}

}
