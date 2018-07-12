package kr.co.mlec.day08.cast;

public class Child01 extends Parent {
    private String name = "첫번째 자식";

    public void play(){
    	System.out.println("나는 놉니다.");
    }

    public void study(){
    	System.out.println("나는 공부합니다(?)");
    }

    public void info(){
    	System.out.println("나는 재정의된 Child01 info() 메소드입니다");
    }

}
