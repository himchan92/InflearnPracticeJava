package javaStart.scanner.ex;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i = num; i <= num2; i++) {
            if(i < num2) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }

        sc.close();
    }
}
