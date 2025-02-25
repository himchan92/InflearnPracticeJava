package middle1.lang.immutable.address;

public class MemberV1Main {
    public static void main(String[] args) {
        Address address = new Address("서울");
        MemberV1 m = new MemberV1("회원a", address);
        MemberV1 b = new MemberV1("회원b", address);

        System.out.println("membera = " + m);
        System.out.println("memberb = " + b);

        //주소 부산으로 변경
        b.getAddress().setValue("부산");
        System.out.println("부산 -> b.address");
        System.out.println("membera = " + m);
        System.out.println("memberb = " + b);
    }
}
