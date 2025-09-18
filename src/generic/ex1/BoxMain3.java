package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> genericBox = new GenericBox<>(); //생성시점에 타입결정
        genericBox.set(10);
        Integer integer = genericBox.get();
        System.out.println("integer=" + integer);

        GenericBox<String> genericBox2 = new GenericBox<>();
        genericBox2.set("hello");
        String str = genericBox2.get();
        System.out.println("str=" + str);
    }
}
