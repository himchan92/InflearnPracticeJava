package cond.ex;

public class CondEx3 {
    public static void main(String[] args) {
        int dollar = 1;

        if(dollar < 0) {
            System.out.println("잘못된 금액");
        }
        else if(dollar == 0) {
            System.out.println("환전금액 없음");
        }
        else {
            System.out.println("계산된 원화금액");
        }
    }
}
