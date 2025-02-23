package Intro_Basic.extends1.ex1.overriding;

public class CarMain {
    // 상속으로 중복제거하고 자식메소드에서 추가하여 확장하는 장점
    // 오버라이딩조건 : 반환타입 동일, 이름동일, 접근제어자 동일 혹은 이하
    public static void main(String[] args) {
        HydrogenCar car = new HydrogenCar();
        car.move();
        car.openDoor();
        car.fillHydrogen();

        ElectricCar e = new ElectricCar();
        e.move();
        e.charge();
    }
}
