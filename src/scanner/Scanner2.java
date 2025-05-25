package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫숫자 입력");
        int num = sc.nextInt();

        System.out.println("둘째숫자 입력");
        int num2 = sc.nextInt();

        int sum = num + num2;

        System.out.println(sum);

        sc.close();
    }
}
