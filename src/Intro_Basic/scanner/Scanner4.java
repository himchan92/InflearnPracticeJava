package Intro_Basic.scanner;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int num = sc.nextInt();
            int num2 = sc.nextInt();

            if(num == 0 && num2 == 0) {
                break;
            }
        }

        sc.close();
    }
}
