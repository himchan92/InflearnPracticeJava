package poly.ex.pay;

public class KakaoPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("카카오페이 연결시도");
        System.out.println(amount + "원 결제 시도");
        return true;
    }
}
