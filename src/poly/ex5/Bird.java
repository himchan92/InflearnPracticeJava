package poly.ex5;

//상속은 단일만 되나 구현은 다중 지원
public class Bird extends AnimalAbstract implements Fly{
    @Override
    public void sound() {
        System.out.println("새 짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 날아오릅니다.");
    }
}
