package javaStart.operator;

public class Operator2 {

    public static void main(String[] args) {
        String result = "hello" + "world";
        System.out.println(result); //문자열 결합 가능

        String s1 = "string1";
        String s2 = "string2";
        int s3 = 10;
        System.out.println(s1 + s2 + s3); //문자열, 숫자 결합 가능하며 연산처리는 안되고 붙기만함
    }
}
