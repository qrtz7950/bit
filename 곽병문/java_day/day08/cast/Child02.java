package kr.co.mlec.day08.cast;

public class Child02 extends Parent {
    private String name = "두번째 자식";

    public void sing(){
    	System.out.println("나는 노래를 부릅니다");
    }

    public void sleep(){
    	System.out.println("나는 잠을 잡니다");
    }

    public void info(){
    	System.out.println("나는 재정의된 Child02 info() 메소드입니다");
    }

}
