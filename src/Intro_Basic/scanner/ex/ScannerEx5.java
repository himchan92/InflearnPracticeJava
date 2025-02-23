package Intro_Basic.scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int temp;

        if(num > num2) {
            temp = num;
            num = num2;
            num2 = temp;
        }

        for(int i = num; i <= num2; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
