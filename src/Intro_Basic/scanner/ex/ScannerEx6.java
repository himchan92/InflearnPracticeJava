package Intro_Basic.scanner.ex;

import java.util.Scanner;

public class ScannerEx6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면종료):");
            String name = sc.next();

            if(name.equals("종료")) {
                break;
            }

            System.out.print("나이를 입력하세요:");
            int age = sc.nextInt();

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }


        sc.close();
    }
}
