package Intro_Basic.poly.ex.pay;

public class NaverPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("네이버페이 연결시도");
        System.out.println(amount + "원 결제 시도");
        return true;
    }
}
