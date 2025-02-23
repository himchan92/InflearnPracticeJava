package poly.ex5;

public class Chicken extends AnimalAbstract implements Fly{
    @Override
    public void sound() {
        System.out.println("치킨 꼬기오");
    }

    @Override
    public void fly() {
        System.out.println("닭은 날지를 못하네...");
    }
}
