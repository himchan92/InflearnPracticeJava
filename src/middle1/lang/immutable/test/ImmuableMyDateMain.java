package middle1.lang.immutable.test;

/*
    불변(final) 사용이유
    - 개발자의 무분별한 값 변경 및 실수로 인한 변경 방지(캐시 절약)
    - 인스턴스 생성통해서만 변경가능
    - 기존 값이 변경되어도 영향안미침
 */
public class ImmuableMyDateMain {
    public static void main(String[] args) {
        ImmuableMyDate immuableMyDate = new ImmuableMyDate(2025, 2, 25);
        ImmuableMyDate immuableMyDate2 = immuableMyDate;;

        System.out.println("immuableMyDate: " + immuableMyDate);

        System.out.println("객체 생성통해 값 변경");
        System.out.println("immuableMyDate3 = " + immuableMyDate2.withYear(2021));
        System.out.println("immuableMyDate3 = " + immuableMyDate2.withMonth(10));
        System.out.println("immuableMyDate3 = " + immuableMyDate2.withDay(11));

    }
}
