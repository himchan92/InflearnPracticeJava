package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름은?");
        String name = sc.nextLine();

        System.out.println("나이는?");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 " + name + "이고 나이는 " + age);

        sc.close();
    }
}
