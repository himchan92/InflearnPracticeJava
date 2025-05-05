package javaStart.scanner.ex;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        sc.close();
    }
}
