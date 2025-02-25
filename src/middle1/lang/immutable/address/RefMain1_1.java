package middle1.lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a; //참조형 변수 대입 : 인스턴스 참조, 주소값 복사, 같은 공간
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
