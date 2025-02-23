package Intro_Basic.extends1.ex3;

public class CarMain {
    // 상속으로 중복제거하고 자식메소드에서 추가하여 확장하는 장점
    public static void main(String[] args) {
        HydrogenCar car = new HydrogenCar();
        car.move();
        car.openDoor();
        car.fillHydrogen();
    }
}
