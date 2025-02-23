package Intro_Basic.loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int sum = 0;
        int max = 100;

        for(int i = 0; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println();
        System.out.println();

        int _max = 1;
        while(_max <= 100) {
            sum += _max;
            _max++;
        }
        System.out.println(max);
    }
}
