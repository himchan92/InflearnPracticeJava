package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요");
        String str = sc.nextLine();
        System.out.println("입력 문자열: " + str);

        sc.close();
    }
}
