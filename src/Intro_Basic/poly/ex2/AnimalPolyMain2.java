package Intro_Basic.poly.ex2;

//부모클래스 상속받아 여러타입 자식대입으로 중복제거 활용 -> 다형성
public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animals = {dog, cat, caw};

        for(Animal item : animals) {
            extracted(item);
        }

    }

    //변하지 않는 부분
    private static void extracted(Animal item) {
        item.sound();
    }
}
