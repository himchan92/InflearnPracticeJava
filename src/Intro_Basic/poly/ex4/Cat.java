package Intro_Basic.poly.ex4;

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("고양이 야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 궁딩이 팡팡.");
    }
}
