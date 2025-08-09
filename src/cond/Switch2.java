package cond;

public class Switch2 {

  public static void main(String[] args) {
    int grade = 2;

    int coupon;
    //조건만족시 break 타고 나오고 다 만족안하면 default 수행
    switch (grade) {
      case 1:
        coupon = 1000;
        break;
      case 2:
        coupon = 1000;
        break;
      case 3:
        coupon = 1000;
        break;
      default:
        coupon = 500;
    }
    System.out.println("발급받은 쿠폰 : " + coupon);
  }

}
