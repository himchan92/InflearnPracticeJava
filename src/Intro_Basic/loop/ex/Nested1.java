package Intro_Basic.loop.ex;

public class Nested1 {

    public static void main(String[] args) {
        int rows = 5;
        for(int i = 0; i < rows; i++) { //줄바꿈
            for(int j = 0; j <= i; j++) { //내부: * 나열
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
