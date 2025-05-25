package scanner.ex;

import java.util.Scanner;

public class ScannerEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력");
            String name = sc.nextLine();

            System.out.print("나이를입력");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("이름 " + name + " 나이 " + age);

            if(name.equals("종료")) {
                break;
            }
        }
        System.out.println("프로그램 종료");

        sc.close();
    }
}
