package middle1.lang.enumeration.ref2;

public class EnumRefMain2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.dicount(Grade.BASIC, price);
        int gold = discountService.dicount(Grade.GOLD, price);
        int diamond = discountService.dicount(Grade.DIAMOND, price);

        System.out.println("BASIC : " + basic);
        System.out.println("GOLD : " + gold);
        System.out.println("DIAMOND : " + diamond);
    }
}
