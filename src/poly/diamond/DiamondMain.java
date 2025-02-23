package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        //메소드는 상속받은 자식에서 재정의한 메소드가 호출
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
