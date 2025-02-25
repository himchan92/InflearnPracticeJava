package middle1.lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        //불변 아닌객체 getter/setter 값변경
        MeutableObj obj = new MeutableObj(10);
        obj.add(20);
        System.out.println("obj = " + obj.getValue());
    }
}