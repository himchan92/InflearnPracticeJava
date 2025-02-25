package middle1.lang.immutable.test;

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
