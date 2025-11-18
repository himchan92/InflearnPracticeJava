package cond.ex;

public class CondEx3 {
    public static void main(String[] args) {
        int dollar = 5;

        if(dollar < 0) {
            System.out.println("잘못된금액");
        } else if(dollar == 0) {
            System.out.println("환전금액없음");
        } else {
            System.out.println("환전금액은 (" + dollar * 1300 + ")원 입니다.");
        }
    }
}
