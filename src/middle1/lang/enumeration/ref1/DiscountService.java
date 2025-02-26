package middle1.lang.enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        //if문 여러개 해서 작성하는것보다 생성자, getter 이용하여 리팩토링 가능
        return price * classGrade.getDiscountPercent() / 100;
    }
}