package poly.ex4;

public class Caw implements Animal{
    @Override
    public void sound() {
        System.out.println("송아지 음매");
    }

    @Override
    public void move() {
        System.out.println("송아지 뿔치기.");
    }
}
