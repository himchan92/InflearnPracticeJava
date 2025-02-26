package middle1.lang.enumeration.ex1;

import middle1.lang.enumeration.ex0.DiscountService;

// ENUM 사용 후 장점 : 입력오타여도 컴파일에러 잡혀서 방지, 코드 명확화
public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC: " + basic);
        System.out.println("GOLD: " + gold);
        System.out.println("DIAMOND: " + diamond);
    }
}