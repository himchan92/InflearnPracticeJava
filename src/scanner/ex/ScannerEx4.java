package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("구구단 몇단?");
        int dan = sc.nextInt();

        for(int i = dan ; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(dan + " x " + j + " = " + (dan * j));
            }
            System.out.println();
        }

        sc.close();
    }
}
