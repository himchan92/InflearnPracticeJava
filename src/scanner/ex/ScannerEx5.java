package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 20;
        int temp = 0;

        //교환처리
        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        sc.close();
    }
}
