package javaStart.scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while(true) {

            System.out.print("0 입력하면 종료");
            int num = input.nextInt();

            if(num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println(sum);

        input.close();
    }
}
