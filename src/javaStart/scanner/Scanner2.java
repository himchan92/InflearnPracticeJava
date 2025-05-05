package javaStart.scanner;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫숫자를 입력하세요:");
        int num1 = sc.nextInt();
        System.out.println(num1);

        System.out.print("둘숫자를 입력하세요:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
        sc.close();
    }
}
