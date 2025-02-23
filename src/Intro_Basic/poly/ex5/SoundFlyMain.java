package Intro_Basic.poly.ex5;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird b = new Bird();
        Chicken ch = new Chicken();

        sound(dog);
        sound(b);
        sound(ch);

        flyAnimal(b);
        flyAnimal(ch);
    }

    private static void sound(AnimalAbstract animalAbstract) {
        animalAbstract.sound();
    }

    private static void flyAnimal(AnimalAbstract animal) {
        animal.sound();
    }
}