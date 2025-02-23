package Intro_Basic.extends1.ex2;

//부모 Car 클래스 상속받아 자식 ElectricCar 에서 부모의 move 를 호출 가능
public class ElectricCar extends Car {
    public void charge() {
        System.out.println("차를 충전합니다.");
    }
}
