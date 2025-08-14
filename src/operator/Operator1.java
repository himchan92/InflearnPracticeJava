package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int minus = a - b;
        System.out.println("a - b = " + minus);

        int mul = a * b;
        System.out.println("a * b = " + mul);

        int div = a / b; //0 나누려하면 에러남
        System.out.println("a / b = " + div);

        int mod = a % b; //알고리즘 활용되니 기억
        System.out.println("a % b = " + mod);
    }
}
