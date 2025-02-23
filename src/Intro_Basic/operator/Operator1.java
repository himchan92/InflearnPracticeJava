package Intro_Basic.operator;

public class Operator1 {

    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        //뺄셈
        int minus = a - b;
        System.out.println("a - b = " + minus);

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        int divide = a / b;
        System.out.println("a / b = " + divide);

        //나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);

        //나눗셈 0 미허용되어 오류발생
        //int z = 10 / 0;
    }
}
