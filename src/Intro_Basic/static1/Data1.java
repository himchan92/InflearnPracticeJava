package Intro_Basic.static1;

public class Data1 {
    public String name;
    public int count;
    
    public Data1(String name) {
        this.name = name;
        count++; //객체 생성때마다 증감
    }
}
