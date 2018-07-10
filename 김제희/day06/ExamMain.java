package kr.co.mlec.day06;

public class ExamMain {

	public static void main(String[] args) {
		
		MethodExam exam = new MethodExam();
		
		int sum = exam.sum(1, 10);
		
		System.out.println("1 + 10 = " + sum);
		System.out.println("1 ~ 10사이의 총합 : " + exam.tsum(1, 10));
		
		exam.displaySum(1, 10, sum);
		
//		int num = 1;
//		int num2 = 10;
		int num = exam.getInt();
		int num2 = exam.getInt();
		exam.displaySum(num, num2, exam.sum(num, num2));
		
		int[] arr = exam.getNums();
		exam.displayArr(arr);
		
		int size = exam.getInt();
		arr = exam.getNums(size);	// 1 ~ 100사이의 난수를 size개 만큼의 정수를 추출
		exam.displayArr(arr);
		
		int max = exam.getInt();
		arr = exam.getNums(size, max);	 // 1 ~ max사이의 난수를 size개 만큼 추출
		exam.displayArr(arr);
	}
}















