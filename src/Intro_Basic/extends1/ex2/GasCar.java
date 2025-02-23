package Intro_Basic.extends1.ex2;

//부모 Car를 상속받은 자식 GasCar에서 fillUp추가, move도 사용가능
public class GasCar extends Car {
    public void fillUp() {
        System.out.println("기름을 채웁니다.");
    }
}
