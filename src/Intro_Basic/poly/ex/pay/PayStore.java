package Intro_Basic.poly.ex.pay;

public abstract class PayStore {
    //결제수단 추가시 변경부분
    public static Pay findPay(String option) {
        if(option.equals("kakao")) {
            return new KakaoPay();
        }
        else if(option.equals("naver")) {
            return new NaverPay();
        }
        else {
            return new DefaultPay();
        }
    }
}
