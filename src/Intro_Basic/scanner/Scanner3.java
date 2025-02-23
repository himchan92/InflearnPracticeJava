package Intro_Basic.scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("문자열을 입력하세요(exit: 종료)");
            String str = sc.nextLine();
            if("exit".equals(str)) {
                break;
            }
            System.out.println("입력한 무자열: " + str);
        }
        System.out.println("종료합니다");
    }
}
