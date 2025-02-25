package middle1.lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = new Address("서울"); //new 생성으로 새로운 주소값 참조로 a 변수 변경해도 b에 영향없음
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}