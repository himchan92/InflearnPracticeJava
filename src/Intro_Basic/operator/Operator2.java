package Intro_Basic.operator;

public class Operator2 {

    public static void main(String[] args) {
        //문자열 더하기
        String result1 = "hello " + "world";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";

        String result2 = s1 + s2;
        System.out.println(result2); //문자열 포함 연산은 그대로 출력

        //연산자는 곱셈이 우선순위 높음
    }
}
