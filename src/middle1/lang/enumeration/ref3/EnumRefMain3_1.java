package middle1.lang.enumeration.ref3;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;

        //구현없이 호출만으로 리팩토링 간결화(Grade Enum에 적용한것 호출만 함)
        int basic = Grade.BASIC.discount(price);
        int gold = Grade.BASIC.discount(price);
        int diamond = Grade.BASIC.discount(price);

        System.out.println("BASIC : " + basic);
        System.out.println("GOLD : " + gold);
        System.out.println("DIAMOND : " + diamond);
    }
}