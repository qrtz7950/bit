package kr.co.Homework0712;

public class Triangle extends Area_abstract{

	public int area(int num) {
		
		int num2 = r.nextInt(7)+2;
		
		return (int)(num * num2 * 0.5);
	}

}
