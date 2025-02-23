package poly.car;

/*
OCP 원칙
- 새로운 기능 추가 시 기존코드변경없이 확장시켜야 한다
- 새로운기능추가되어도 인터페이스 구현메소드에 상속받은 자식이 재정의하고 활용하여 기존코드변경없이 확장가능한것이다.
 */
public class CarMain1 {
    public static void main(String[] args) {
        Driver d = new Driver();

        K3Car k = new K3Car();
        d.setCar(k); //k3car 대상
        d.drive();

        //차량 변경 : OCP 원칙 준수하여 drive 메소드 수정안하고 확장시킨 예제
        Model3Car m = new Model3Car();
        d.setCar(m);
        d.drive();
    }
}