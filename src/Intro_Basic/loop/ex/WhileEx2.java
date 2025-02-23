package Intro_Basic.loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {
        int num = 2;
        for(int i = num; i <= 20; i += 2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();

        while(num <= 20) {
            System.out.println(num);
            num += 2;
        }
    }
}
