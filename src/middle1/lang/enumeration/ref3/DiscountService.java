package middle1.lang.enumeration.ref3;

import middle1.lang.enumeration.ref3.Grade;

public class DiscountService {
    public int dicount(Grade grade, int price) {
        return grade.discount(price);
    }
}