package javaStart.operator;

public class Operator1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println(sum);

        int diff = a - b;
        System.out.println(diff);

        int multi = a * b;
        System.out.println(multi);

        int divide = a / b; // 0은 못나누니 수행 하면 오류 발생
        System.out.println(divide);

        int mod = a % b;
        System.out.println(mod);
    }
}
