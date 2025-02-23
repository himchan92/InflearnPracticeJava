package Intro_Basic.loop.ex;

public class WhileEx1 {

    public static void main(String[] args) {
        int count = 1;

        while(count <= 10) {
            System.out.println(count);
            count++;
        }

        System.out.println();
        System.out.println();

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
