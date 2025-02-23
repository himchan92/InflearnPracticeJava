package poly.ex3;

public class AnimalAbstractMain1 {
    public static void main(String[] args) {
        //추상클래스는 생성불가
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        sound(dog);
        sound(cat);
        sound(caw);

    }

    private static void sound(Animal animal) {
        animal.sound();
        animal.move();
    }
}
