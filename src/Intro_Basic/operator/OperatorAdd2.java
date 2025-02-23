package Intro_Basic.operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = ++a; //증감먼저 후 출력
        System.out.println("a = " + a + ", b = " + b); //2

        //후위증감 : 출력 후 증감처리
        a = 1;
        b = 0;
        b = a++;
        System.out.println(b); //1
    }
}
