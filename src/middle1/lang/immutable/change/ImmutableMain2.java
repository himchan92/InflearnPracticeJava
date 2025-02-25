package middle1.lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        //불변으로 변경안되고 10 그대로 나옴
        System.out.println("obj1 = " + obj1.getValue());
    }
}
