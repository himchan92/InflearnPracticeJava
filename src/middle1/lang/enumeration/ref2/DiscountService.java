package middle1.lang.enumeration.ref2;

public class DiscountService {
    public int dicount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}