package Intro_Basic.poly.ex3;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("강아지 멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지 달립니다.");
    }
}
