package middle1.lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car c = new Car("model Y");
        Dog d = new Dog("멍멍이1", 2);
        Dog d2 = new Dog("멍멍이2", 5);

        System.out.println("단순 toString 호출");
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(d2.toString());

        System.out.println("println() 내부 toString 호출");
        System.out.println(c);
        System.out.println(d);
        System.out.println(d2);

        System.out.println("Object 다형성 활용");
        ObjectPrinter.print(c);
        ObjectPrinter.print(d);
        ObjectPrinter.print(d2);
    }
}
