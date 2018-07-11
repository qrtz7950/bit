package day06;

public class ExamMain {

	public static void main(String[] args) {

		MethodExam exam = new MethodExam();
		
		int sum = exam.sum(1,10);
		
		System.out.println("1 + 10 = " + sum);
		System.out.println();
		
		System.out.println("1~10 ªÁ¿Ã¿« √—«’: " + exam.tsum(1,10));
		System.out.println();
		
		exam.displaySum(1,10,sum);
		System.out.println();
		
//		int num =1;
//		int num2 = 10;
		int num = exam.getInt();
		int num2 = exam.getInt();
		exam.displaySum(num, num2, exam.sum(num,  num2));
		
		int[] arr = exam.getNums();
		exam.displayArr(arr);

		int size = exam.getInt();
		arr = exam.getNums(size);
		exam.displayArr(arr);
	
		
		int max = exam.getInt();
		arr = exam.getNums(size,max);
		exam.displayArr(arr);
	}

}
