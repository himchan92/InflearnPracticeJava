package loop.ex;

public class LoopEx3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
