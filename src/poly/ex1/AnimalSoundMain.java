package poly.ex1;

// 다형성 적용 전 기존 방식 예제
// 타입이 서로 달라 매번 해당 타입의 객체, 메소드를 생성하는 단점 보완 필요
public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();

        System.out.println("동물소리 시작");
        dog.sound();
        System.out.println("강아지 종료");

        cat.sound();
        System.out.println("고양이 종료");

        caw.sound();
        System.out.println("송아지 종료");

        sound(caw);
    }

    private static void sound(Caw caw) {
        System.out.println("동물 소리 테스트");
        caw.sound();
        System.out.println("동물 소리 종료");
    }
}
