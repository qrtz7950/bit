package day02;
import java.util.Scanner;

public class IfMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String grade = "";
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			grade = "A";
				if(score >= 98) {
					grade = "A+";
				} else if(score <93) {
					grade = "A-";
				}
			
		} else if (score >= 80) {
			grade = "B";
				if(score >= 88) {
					grade = "B+";
				} else if(score <83) {
					grade = "B-";
				}
			
		} else {
			grade = "F";
			
		}
		System.out.println("학점: " + grade);
	}

}
