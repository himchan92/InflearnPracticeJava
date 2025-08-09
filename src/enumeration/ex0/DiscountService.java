package enumeration.ex0;

public class DiscountService {

  public int discount(String grade, int price) {
    int discountPercent = 0;

    //열겨형을 쓰면 아래 문자열 값 철자오타 오류를 방지하여 안전성있는 장점
    if(grade.equals("BASIC")) {
      discountPercent = 10;
    }
    else if(grade.equals("GOLD")) {
      discountPercent = 20;
    }
    else if(grade.equals("DIAMOND")) {
      discountPercent = 30;
    }
    else {
      System.out.println(grade + ": 할인x");
    }

    return price * discountPercent / 100;
  }
}
