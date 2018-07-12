package day08.cast;

public class Child01 extends day08.cast.Parent {
    private String name = "첫째자식";

    public void play(){
    	System.out.println("논다");
    }

    public void study(){
    	System.out.println("공부한다");
    }

    public void info(){
    	System.out.println("나는 Parent 클래스에서 재정의된 Child01 info()다.");
    }

}
