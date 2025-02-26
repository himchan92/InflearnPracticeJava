package middle1.lang.enumeration.ex0;

// ENUM 사용 전 단점 : 철자오타우려, 데이터 일관성 부족, 타입안정성 부족, 컴파일 시 오류 미감지
// ENUM 사용 후 장점 : 사전 입력오타방지, 데이터일관성, 특정범위 사전제한
public class StringGradeEx1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC: " + basic);
        System.out.println("GOLD: " + gold);
        System.out.println("DIAMOND: " + diamond);
    }
}