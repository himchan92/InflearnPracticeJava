package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int minus = a - b;
        System.out.println("a - b = " + minus);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int divide = a / b;
        System.out.println("a / b = " + divide);

        int mod = a % b; //0나누면 에러발생 주의
        System.out.println("a % b = " + mod);
    }
}
