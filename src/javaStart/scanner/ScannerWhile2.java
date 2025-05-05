package javaStart.scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 두번째 숫자 모두 0입력하면 종료");

        while(true) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(num1 == 0 && num2 == 0) {
                break;
            }
        }

        sc.close();
    }
}
