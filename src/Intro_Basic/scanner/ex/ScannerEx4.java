package Intro_Basic.scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단의 단수를 입력해주세요:");
        int dan = sc.nextInt();

        System.out.println(dan + "단의 구구단:");

        for(int i = dan; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
        }

        sc.close();
    }
}
