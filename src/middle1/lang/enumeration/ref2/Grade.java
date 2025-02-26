package middle1.lang.enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30); //추가 작성시 끝에 세미콜론 필수

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}