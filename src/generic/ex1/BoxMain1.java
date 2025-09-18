package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        //제네릭이 없으면 타입이 다른경우 각각 맞게 생성해줘야하는 불편함..
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer=" + integer);
    }
}
