package middle1.lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //final 효과로 값 변경 불가하여 new 생성으로 별도 메모리할당으로만 변경가능
        b = new ImmutableAddress("광주");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
