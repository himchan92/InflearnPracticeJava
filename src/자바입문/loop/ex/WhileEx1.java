package 자바입문.loop.ex;

public class WhileEx1 {

    public static void main(String[] args) {
        int count = 0;

        while(count < 10) {
            count++;
            System.out.println(count);
        }
        System.out.println();

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
