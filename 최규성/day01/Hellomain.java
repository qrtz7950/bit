package kr.co.mlec;

public class Hellomain {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		for(int i=1; i<10; i++)
			for(int j=1; j<10; j++)
				System.out.printf("%d x %d = %1d ",i, j,i*j);
				//System.out.println(i + " x " + j + " = " + (i*j));
		
	}
}
