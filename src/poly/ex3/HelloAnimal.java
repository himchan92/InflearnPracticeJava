package poly.ex3;

public class HelloAnimal extends Animal{

    //추상클래스 상속받은 자식은 구현 필수
    @Override
    public void sound() {
        System.out.println("hello animal sound");
    }

    @Override
    public void move() {
        System.out.println("hello animal move");
    }
}
