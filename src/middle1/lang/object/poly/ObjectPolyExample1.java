package middle1.lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog d = new Dog();
        Car c = new Car();

        action(d);
        action(c);
    }

    //Object 는 가장 최상위 부모라 Dog, Car 다 하위라서 받을 수 있음
    private static void action(Object obj) {
        // Object 에는 sound, move 메소드가 없어 오류
        // obj.sound();
        // obj.move();

        // Object 가 받으려면 해당 객체에 맞게 다운 캐스팅
        if(obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
