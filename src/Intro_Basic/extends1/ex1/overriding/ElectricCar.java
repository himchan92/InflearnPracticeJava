package Intro_Basic.extends1.ex1.overriding;

public class ElectricCar extends Car {
    //자식이 부모로 받은 메도스를 재정의 = 오버라이딩
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("전기차 충전합니다.");
    }
}
