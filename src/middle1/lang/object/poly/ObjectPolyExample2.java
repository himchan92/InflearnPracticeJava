package middle1.lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog d = new Dog();
        Car c = new Car();

        Object object = new Object(); // Object 도 인스턴스 생성 가능

        Object[] objects = {d, c, object};
        getSize(objects);
    }

    private static void getSize(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}