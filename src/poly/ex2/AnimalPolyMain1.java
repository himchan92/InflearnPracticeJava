package poly.ex2;

//부모클래스 상속받아 여러타입 자식대입으로 중복제거 활용 -> 다형성
public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        //메소드 오버라이딩(@Override) 효과로 각각 자식객체 대입으로 해당 메소드 호출 가능
        sound(dog);
        sound(cat);
        sound(caw);
    }

    private static void sound(Animal animal) {
        System.out.println("동물 테스트 시작");
        animal.sound();
        System.out.println("동물 테스트 종료");
    }
}
