package Intro_Basic.cond.ex;

public class CondEx3 {

    public static void main(String[] args) {
        int dollar = 10;

        if(dollar < 0) {
            System.out.println("잘못된 금액");
        }
        else if(dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        }
        else {
            int num = dollar * 1300;
            System.out.println("환전 금액은 (계산된 원화 금액) " +  num + " 원 입니다.");
        }
    }
}
