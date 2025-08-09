package cond;

public class If5 {

  public static void main(String[] args) {
    int price = 10000;
    int age = 10;
    int discount = 0;

    if(price >= 10000) {
      discount = discount + 1000;
      System.out.println(discount);
      System.out.println("10000만원 구매 1000원 할인");
    }
  }
}
