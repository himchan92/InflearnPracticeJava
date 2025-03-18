package generic.ex1;

public class BoxMain1 {

    /*
        제네릭 적용 전
        - 타입이 다르면 해당 타입에 맞게 각각 객체생성해줘야 하는 번거로움
     */
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
