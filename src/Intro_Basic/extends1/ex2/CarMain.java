package Intro_Basic.extends1.ex2;

/*
 상속 : 단순 물려받는게 아닌 부모의 인스턴스가 자식인스턴스에 포함되어 생성 = 부모메모리까지 자식에 같이 할당
 */
public class CarMain {

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.move(); //상속효과로 부모메소드 사용
        e.charge(); //자식메소드

        GasCar g = new GasCar();
        g.move(); //상속효과로 부모메소드 사용
        g.fillUp(); //자식메소드
    }
}
