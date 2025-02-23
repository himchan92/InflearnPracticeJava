package Intro_Basic.poly.ex4;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("강아지 멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지 달린다.");
    }
}
